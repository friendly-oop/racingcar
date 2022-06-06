package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private static final int MIN_PARTICIPANT_COUNT = 1;
    private static final int MIN_GAME_COUNT = 1;
    private static final String VALID_PARTICIPANT_COUNT_MESSAGE = "참가 자동차 수는 1 이상이어야 합니다.";
    private static final String VALID_GAME_COUNT_MESSAGE = "경기 수는 1 이상이어야 합니다.";

    private List<Car> participants;
    private Game gameCount;

    public static Race of(final int participantCount, final int gameCount) {
        validateParticipantCount(participantCount);
        validateGameCount(gameCount);

        Race race = new Race();
        race.participants = new ArrayList<>();
        for(int i = 0; i< participantCount;i++) {
            race.participants.add(new Car());
        }

        race.gameCount = Game.of(gameCount);

        return race;
    }

    private static void validateParticipantCount(final int participantCount) {
        if(participantCount < MIN_PARTICIPANT_COUNT) {
            throw new IllegalArgumentException(VALID_PARTICIPANT_COUNT_MESSAGE);
        }
    }

    private static void validateGameCount(final int gameCount) {
        if(gameCount < MIN_GAME_COUNT) {
            throw new IllegalArgumentException(VALID_GAME_COUNT_MESSAGE);
        }
    }

    public int getParticipantSize() {
        return participants.size();
    }
}
