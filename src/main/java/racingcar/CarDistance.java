package racingcar;

import static racingcar.TextUtil.printDistanceByHyphen;

public class CarDistance {
    private int distance;

    public CarDistance(int distance) {
        this.distance = distance;
    }

    public String printDistance() {
        return printDistanceByHyphen(distance);
    }
}
