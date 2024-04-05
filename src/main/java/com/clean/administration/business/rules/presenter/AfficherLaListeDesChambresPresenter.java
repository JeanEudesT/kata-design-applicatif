package com.clean.administration.business.rules.presenter;

import com.clean.administration.business.entity.Chambre;

import java.util.List;

public interface AfficherLaListeDesChambresPresenter {
    void afficherLaListeDesChambres(List<Chambre> chambres);
}
