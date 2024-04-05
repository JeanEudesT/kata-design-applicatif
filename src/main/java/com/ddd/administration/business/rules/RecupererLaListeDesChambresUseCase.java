package com.ddd.administration.business.rules;

import com.ddd.administration.business.entity.Chambre;
import com.ddd.administration.business.entity.Hotel;
import com.ddd.administration.business.gateway.HotelRepository;
import com.ddd.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;
import com.ddd.administration.business.rules.usecase.RecupererLaListeDesChambres;

import java.util.List;

public class RecupererLaListeDesChambresUseCase implements RecupererLaListeDesChambres {
    AfficherLaListeDesChambresPresenter presenter;
    HotelRepository respository;

    public RecupererLaListeDesChambresUseCase(AfficherLaListeDesChambresPresenter presenter, HotelRepository respository) {
        this.presenter = presenter;
        this.respository = respository;
    }


    @Override
    public void execute() {
        Hotel hotel = this.respository.recupererHotel();
        this.presenter.afficherLaListeDesChambres(hotel.getChambres());
    }
}
