package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Participant {
    private List<Car> participants;

    private Participant() {
    }

    public static Participant of(int participantCount) {
        Participant participant = new Participant();

        participant.participants = new ArrayList<>();
        for(int i = 0; i< participantCount;i++) {
            participant.participants.add(new Car());
        }

        return participant;
    }

    public int getSize() {
        return participants.size();
    }
}
