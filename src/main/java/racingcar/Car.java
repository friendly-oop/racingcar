package racingcar;

public class Car {
    private CarDistance distance;

    public Car() {
        this.distance = new CarDistance(0);
    }

    public String printCarDistance() {
        return this.distance.printDistance();
    }
}
