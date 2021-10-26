package org.awesome.ai.state;

import org.awesome.ai.state.immovable.Obstacle;
import org.awesome.ai.state.movable.Bot;
import org.awesome.ai.state.movable.Player;

import java.util.List;

public final class GameState {

    private final List<Obstacle> obstacles;
    private final List<Bot> bots;
    private final Player player;
    private final int levelWidth, levelHeight;

    private GameState(List<Obstacle> obstacles, List<Bot> bots, Player player, int levelWidth, int levelHeight) {
        this.obstacles = obstacles;
        this.bots = bots;
        this.player = player;
        this.levelWidth = levelWidth;
        this.levelHeight = levelHeight;
    }

    public static GameStateBuilder builder() {
        return new GameStateBuilder();
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public List<Bot> getBots() {
        return bots;
    }

    public Player getPlayer() {
        return player;
    }

    public int getLevelWidth() {
        return levelWidth;
    }

    public int getLevelHeight() {
        return levelHeight;
    }

    public static class GameStateBuilder {
        private List<Obstacle> obstacles;
        private List<Bot> bots;
        private Player player;
        private int levelWidth;
        private int levelHeight;

        public GameStateBuilder obstacles(List<Obstacle> obstacles) {
            this.obstacles = obstacles;
            return this;
        }

        public GameStateBuilder bots(List<Bot> bots) {
            this.bots = bots;
            return this;
        }

        public GameStateBuilder player(Player player) {
            this.player = player;
            return this;
        }

        public GameStateBuilder levelWidth(int levelWidth) {
            this.levelWidth = levelWidth;
            return this;
        }

        public GameStateBuilder levelHeight(int levelHeight) {
            this.levelHeight = levelHeight;
            return this;
        }

        public GameState build() {
            return new GameState(obstacles, bots, player, levelWidth, levelHeight);
        }
    }
}
