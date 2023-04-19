package com.jad.customer;

import com.jad.show.IShow;

public interface ISpectator {
    String getFirstName();

    String getLastName();

    void watch(IShow show);
}
