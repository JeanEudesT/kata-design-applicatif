package com.ddd.administration.business.gateway;

import com.ddd.administration.business.entity.Hotel;

import java.util.List;

public interface HotelRepository {

    Hotel recupererHotel();
    void modifier(Hotel hotel);
}
