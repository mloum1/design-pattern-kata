package com.jad.show;

import com.jad.customer.ISpectator;

public class ConcertShow extends Show {
    private final String artist;

    public ConcertShow(final String name, final String description, final String artist) {
        super(name, description, ShowType.CONCERT);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
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
