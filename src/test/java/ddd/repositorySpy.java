package ddd;

import com.ddd.administration.business.entity.Hotel;
import com.ddd.administration.business.gateway.HotelRepository;

import java.util.List;

public class repositorySpy implements HotelRepository {

    private Hotel hotel;

    public repositorySpy(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public Hotel recupererHotel() {
        return this.hotel;
    }

    @Override
    public void modifier(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
