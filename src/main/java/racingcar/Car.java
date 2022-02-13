package racingcar;

public class Car {
    private int id;
    private CarDistance distance;

    public Car(int id) {
        this.id = id;
        this.distance = new CarDistance(0);
    }

    public String printCarDistance() {
        return this.distance.printDistance();
    }
}
