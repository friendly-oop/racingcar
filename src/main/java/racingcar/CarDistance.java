package racingcar;

public class CarDistance {
    private static final String HYPHEN = "-";
    private int distance;

    public CarDistance(int distance) {
        this.distance = distance;
    }

    public String printDistance() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<this.distance;i++) {
            sb.append(HYPHEN);
        }

        return sb.toString();
    }
}
