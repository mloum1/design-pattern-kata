package com.jad.customer;

import java.text.MessageFormat;
import java.util.stream.Collectors;

import com.jad.show.ConcertShow;
import com.jad.show.IShow;
import com.jad.show.MovieShow;
import com.jad.show.ShowVisitor;
import com.jad.show.StreetShow;
import com.jad.show.TheaterShow;

public class Spectator implements ShowVisitor {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void visit(MovieShow show) {
        System.out.println(MessageFormat.format(
                "J''ai assisté au film {0} de {1} sorti en {2}",
                show.getName(), show.getDirector(), show.getYearOfRelease()));
    }

    @Override
    public void visit(ConcertShow show) {
        System.out.println(MessageFormat.format(
                "J''ai assisté au concert {0} de {1}",
                show.getName(), show.getArtist()));
    }

    @Override
    public void visit(TheaterShow show) {
        System.out.println(MessageFormat.format(
                "J''ai assisté à la pièce de théâtre {0} de {1}. Il y avait : {2}",
                show.getName(), show.getDirector(),
                show.getActors().stream().collect(Collectors.joining(", "))));
    }

    @Override
    public void visit(StreetShow show) {
        System.out.println(MessageFormat.format(
                "J''ai assisté au spectacle de rue {0}. Il y avait : {1}",
                show.getName(),
                show.getPerformers().stream().collect(Collectors.joining(", "))));
    }

}
