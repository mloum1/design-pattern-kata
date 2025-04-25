package com.jad.customer;

import com.jad.show.ConcertShow;
import com.jad.show.IShow;
import com.jad.show.MovieShow;
import com.jad.show.StreetShow;
import com.jad.show.TheaterShow;

public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(IShow show);

    /**
     * Permet d 'afficher les shows pour chaque show qu'un spectateur peut regarder
     */
    void watch(ConcertShow concertShow);

    void watch(MovieShow movieShow);

    void watch(StreetShow streetShow);

    void watch(TheaterShow theaterShow);
}
