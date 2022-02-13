package racingcar;

public class Race {
    private RacingDistanceCount distanceCount;
    private Car[] cars;

    public Race(Car[] cars, int distanceCount) {
        this.distanceCount = new RacingDistanceCount(distanceCount);
        this.cars = cars;
    }
}
