package racingcar;

import static racingcar.TextUtil.printDistanceByHyphen;

public class CarDistance {
    private final int CAN_MOVE_VALUE = 4;
    private final int MAX_MOVE_VALUE = 9;
    private final int ZERO = 0;
    private final int MOVE_VALUE = 1;
    private final String MOVE_EXCEPTION_MESSAGE = "파라미터가 음수 혹은 9 초과이면 안됩니다.";
    private int distance;

    public CarDistance(int distance) {
        this.distance = distance;
    }

    public String printDistance() {
        return printDistanceByHyphen(distance);
    }

    public void move(int randomValue) {
        if(randomValue > MAX_MOVE_VALUE || randomValue < ZERO) {
            throw new IllegalArgumentException(MOVE_EXCEPTION_MESSAGE);
        }
        
        if(randomValue >= CAN_MOVE_VALUE) {
            this.distance += MOVE_VALUE;
        }
    }
}
