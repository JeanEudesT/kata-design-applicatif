package com.ddd.administration.controller.presenter;

import com.ddd.administration.business.entity.Chambre;
import com.ddd.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;

import java.util.List;

public class AfficherLesChambresPresenter implements AfficherLaListeDesChambresPresenter {

    String chambres;

    @Override
    public void afficherLaListeDesChambres(List<Chambre> chambres) {
        this.chambres = chambres.toString();
    }

    public String getChambres() {
        return chambres;
    }

}
