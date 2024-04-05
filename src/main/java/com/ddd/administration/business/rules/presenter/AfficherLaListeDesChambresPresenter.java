package com.ddd.administration.business.rules.presenter;

import com.ddd.administration.business.entity.Chambre;

import java.util.List;

public interface AfficherLaListeDesChambresPresenter {
    void afficherLaListeDesChambres(List<Chambre> chambres);
}
