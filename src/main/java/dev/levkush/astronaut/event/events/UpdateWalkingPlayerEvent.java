package dev.levkush.astronaut.event.events;

import dev.levkush.astronaut.event.EventStage;

public class UpdateWalkingPlayerEvent
        extends EventStage {
    public UpdateWalkingPlayerEvent(int stage) {
        super(stage);
    }
}

