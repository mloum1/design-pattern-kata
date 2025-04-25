package com.jad.show;

public abstract class ShowFactory {
    public MovieShow makeMovieShow(String name, String description, String director, String year, MovieType movieType) {
        return new MovieShow(name, description, director, year, movieType);
    }

    public ConcertShow makeConcertShow(String name, String description, String artist) {
        return new ConcertShow(name, description, artist);
    }

    public TheaterShow makeTheaterShow(String name, String description, String director, String... actors) {
        return new TheaterShow(name, description, director, actors);
    }

    public StreetShow makeStreetShow(String name, String description, String... performers) {
        return new StreetShow(name, description, performers);
    }
}
