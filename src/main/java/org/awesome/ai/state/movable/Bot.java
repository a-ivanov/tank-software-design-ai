package org.awesome.ai.state.movable;

public final class Bot extends Actor {

    private Bot(Object source, int x, int y, int destX, int destY, Orientation orientation) {
        super(source, x, y, destX, destY, orientation);
    }

    public static BotBuilder builder() {
        return new BotBuilder();
    }

    public static class BotBuilder {

        private Object source;
        private int x;
        private int y;
        private int destX;
        private int destY;
        private Orientation orientation;

        public BotBuilder source(Object source) {
            this.source = source;
            return this;
        }

        public BotBuilder x(int x) {
            this.x = x;
            return this;
        }

        public BotBuilder y(int y) {
            this.y = y;
            return this;
        }

        public BotBuilder destX(int destX) {
            this.destX = destX;
            return this;
        }

        public BotBuilder destY(int destY) {
            this.destY = destY;
            return this;
        }

        public BotBuilder orientation(Orientation orientation) {
            this.orientation = orientation;
            return this;
        }

        public Bot build() {
            return new Bot(source, x, y, destX, destY, orientation);
        }
    }
}
