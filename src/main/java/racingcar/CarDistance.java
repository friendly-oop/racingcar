package racingcar;

import static racingcar.TextUtil.printDistanceByHyphen;

public class CarDistance {
    private final int CAN_MOVE_VALUE = 4;
    private final int MOVE_VALUE = 1;
    private int distance;

    public CarDistance(int distance) {
        this.distance = distance;
    }

    public String printDistance() {
        return printDistanceByHyphen(distance);
    }

    public void move(int randomValue) {
        if(randomValue >= CAN_MOVE_VALUE) {
            this.distance += MOVE_VALUE;
        }
    }
}
