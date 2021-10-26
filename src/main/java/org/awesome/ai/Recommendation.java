package org.awesome.ai;

import org.awesome.ai.state.movable.Actor;

public final class Recommendation {

    private final Actor actor;
    private final Action action;

    public Recommendation(Actor actor, Action action) {
        this.actor = actor;
        this.action = action;
    }

    public Actor getActor() {
        return actor;
    }

    public Action getAction() {
        return action;
    }
}
