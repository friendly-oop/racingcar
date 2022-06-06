package racingcar;

public class Race {
    private static final int MIN_PARTICIPANT_COUNT = 1;
    private static final int MIN_GAME_COUNT = 1;
    private static final String VALID_PARTICIPANT_COUNT_MESSAGE = "참가 자동차 수는 1 이상이어야 합니다.";

    private Participant participantCount;
    private Game gameCount;

    public static Race of(final int participantCount, final int gameCount) {
        validateParticipantCount(participantCount);

        Race race = new Race();
        race.participantCount = Participant.of(participantCount);
        race.gameCount = Game.of(gameCount);

        return race;
    }

    private static void validateParticipantCount(final int participantCount) {
        if(participantCount < MIN_PARTICIPANT_COUNT) {
            throw new IllegalArgumentException(VALID_PARTICIPANT_COUNT_MESSAGE);
        }
    }
}
