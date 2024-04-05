package com.clean.administration.controller.presenter;

import com.clean.administration.business.entity.Chambre;
import com.clean.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;

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
