package racingcar.util;


import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    private static final int ROUND_BOUND = 10;
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    public static int pullNumber() {
        return random.nextInt(ROUND_BOUND);
    }
}
