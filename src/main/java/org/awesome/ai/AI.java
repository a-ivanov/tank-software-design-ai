package org.awesome.ai;

import org.awesome.ai.state.GameState;

import java.util.List;

public interface AI {

    List<Recommendation> recommend(GameState gameState);
}
