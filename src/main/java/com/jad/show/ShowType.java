package com.jad.show;

public enum ShowType {
    MOVIE("Cinéma"),
    STREET_SHOW("Spectacle de rue"),
    THEATER("Théâtre"),
    CONCERT("Concert"),
    OTHER("Autre");

    private final String name;

    ShowType(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
