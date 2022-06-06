package racingcar;

public class CarLocation {
    private int location;

    public static CarLocation of(int location) {
        CarLocation carLocation = new CarLocation();
        carLocation.location = location;
        return carLocation;
    }

    public int getLocation() {
        return location;
    }
}
