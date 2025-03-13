package test.java;

public enum Level {
    PENDING(1), PROCESSING(2), PROCESSED(3);

    private int i;

    private Level(int i) {
        this.i = i;
    }
}
