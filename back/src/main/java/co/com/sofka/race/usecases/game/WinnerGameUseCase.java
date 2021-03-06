package co.com.sofka.race.usecases.game;

import co.com.sofka.race.usecases.player.GetPlayerUseCase;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Service
@Validated
public class WinnerGameUseCase implements Function<String, Mono<String>> {

    private final GetGameUseCase getGameUseCase;
    private final GetPlayerUseCase getPlayerUseCase;

    public WinnerGameUseCase(GetGameUseCase getGameUseCase, GetPlayerUseCase getPlayerUseCase) {
        this.getGameUseCase = getGameUseCase;
        this.getPlayerUseCase = getPlayerUseCase;
    }

    @Override
    public Mono<String> apply(String id) {
        return getGameUseCase.apply(id)
                .flatMap(
                        foundGameDTO -> getPlayerUseCase.apply(foundGameDTO.getIdUser())
                                .flatMap(playerDTO -> {
                                    if(foundGameDTO.getLaneWinner() == playerDTO.getBetCarriel()){
                                        return Mono.just("¡You win!");

                                    }
                                    return Mono.just("¡You lost!");
                                })
                );
    }
}
