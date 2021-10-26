package org.awesome.ai.strategy;

import org.awesome.ai.AI;
import org.awesome.ai.Recommendation;
import org.awesome.ai.state.GameState;

import java.util.Collections;
import java.util.List;

public class NotRecommendingAI implements AI {

    @Override
    public List<Recommendation> recommend(GameState gameState) {
        return Collections.emptyList();
    }
}
