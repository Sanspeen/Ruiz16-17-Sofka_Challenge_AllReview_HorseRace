package co.com.sofka.race.model;

public class TrackDTO {

    private String id;
    private String name;
    private int km;
    private int[] lanes;
    private int[][] racecourse;
    private boolean isCompleted;
    private int laneWinner;

    public TrackDTO() {
    }

    public TrackDTO(String name, int km, int[] lanes, int[][] racecourse, boolean isCompleted, int laneWinner) {
        this.name = name;
        this.km = km;
        this.lanes = lanes;
        this.racecourse = racecourse;
        this.isCompleted = isCompleted;
        this.laneWinner = laneWinner;
    }

    public TrackDTO(String id, String name, int km, int[] lanes, int[][] racecourse, boolean isCompleted, int laneWinner) {
        this.id = id;
        this.name = name;
        this.km = km;
        this.lanes = lanes;
        this.racecourse = racecourse;
        this.isCompleted = isCompleted;
        this.laneWinner = laneWinner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int[] getLanes() {
        return lanes;
    }

    public void setLanes(int[] lanes) {
        this.lanes = lanes;
    }

    public int[][] getRacecourse() {
        return racecourse;
    }

    public void setRacecourse(int[][] racecourse) {
        this.racecourse = racecourse;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getLaneWinner() {
        return laneWinner;
    }

    public void setLaneWinner(int laneWinner) {
        this.laneWinner = laneWinner;
    }
}
