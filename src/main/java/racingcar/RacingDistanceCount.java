package racingcar;

public class RacingDistanceCount {
    private final String DISTANCE_COUNT_EXCEPTION_MESSAGE = "이동횟수가 null이면 안 됩니다.";
    private Integer distanceCount;

    public RacingDistanceCount(Integer distanceCount) {
        if(distanceCount == null) {
            throw new IllegalArgumentException(DISTANCE_COUNT_EXCEPTION_MESSAGE);
        }
        this.distanceCount = distanceCount;
    }
}
