package com.ddd.administration.business.rules;

import com.ddd.administration.business.entity.Chambre;
import com.ddd.administration.business.entity.Hotel;
import com.ddd.administration.business.gateway.HotelRepository;
import com.ddd.administration.business.rules.usecase.FixerLePrixDuneChambreUseCase;

import java.util.List;

public class FixerLePrixDuneChambre implements FixerLePrixDuneChambreUseCase {

    HotelRepository repository;

    public FixerLePrixDuneChambre(HotelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double prixDuRDC) {
        Hotel hotel = this.repository.recupererHotel();
        hotel.fixerPrix(prixDuRDC);
        this.repository.modifier(hotel);
    }
}
