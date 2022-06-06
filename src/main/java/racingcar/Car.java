package racingcar;

public class Car {
    private static final int CAR_MOVE_DISTANCE = 1;
    private CarLocation location;

    public Car() {
        this.location = CarLocation.of(0);
    }

    public void move() {
        this.location = CarLocation.of(
                location.getLocation() + CAR_MOVE_DISTANCE
        );
    }

    public int getLocation() {
        return location.getLocation();
    }
}
