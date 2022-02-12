package racingcar;

public class TextUtil {
    private static final String HYPHEN = "-";

    public static String printDistanceByHyphen(int distance) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<distance;i++) {
            sb.append(HYPHEN);
        }
        return sb.toString();
    }
}
