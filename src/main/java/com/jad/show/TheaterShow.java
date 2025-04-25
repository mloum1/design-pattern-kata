package com.jad.show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.jad.customer.ISpectator;

public class TheaterShow extends Show {
    private final String director;
    private final ArrayList<String> actors = new ArrayList<>();

    public TheaterShow(final String name, final String description, final String director, final String... actors) {
        super(name, description, ShowType.THEATER);
        this.director = director;
        this.actors.addAll(Arrays.asList(actors));
    }

    public String getDirector() {
        return this.director;
    }

    public List<String> getActors() {
        return Collections.unmodifiableList(this.actors);
    }

    @Override
    public void showARegarder(ISpectator spectator) {
        spectator.watch(this);
    }

    @Override
    public void accept(ShowVisitor visitor) {
        visitor.visit(this);
    }
}
