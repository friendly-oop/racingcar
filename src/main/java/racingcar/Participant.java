package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Participant {
    private List<Car> participant;

    private Participant() {
    }

    public static Participant of(int participantCount) {
        Participant participant = new Participant();
        participant.participant = new ArrayList<>(participantCount);
        return participant;
    }
}
