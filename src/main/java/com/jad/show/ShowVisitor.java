package com.jad.show;

public interface ShowVisitor {
    void visit(MovieShow movieShow);

    void visit(ConcertShow concertShow);

    void visit(TheaterShow theaterShow);

    void visit(StreetShow streetShow);
}
