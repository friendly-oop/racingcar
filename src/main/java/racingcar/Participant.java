package racingcar;

public class Participant {
    private int count;

    private Participant() {
    }

    public static Participant of(int participantCount) {
        Participant participant = new Participant();
        participant.count = participantCount;
        return participant;
    }
}
