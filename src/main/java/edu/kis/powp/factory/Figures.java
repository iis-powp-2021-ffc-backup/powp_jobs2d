package edu.kis.powp.factory;

public enum Figures {
    RECTANGLE("rectangle"),
    SQUARE("square"),
    CROSS("cross");

    public final String figureName;

    Figures(String string) {
        this.figureName = string;
    }
}
