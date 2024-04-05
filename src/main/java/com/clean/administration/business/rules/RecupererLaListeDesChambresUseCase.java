package com.clean.administration.business.rules;

import com.clean.administration.business.entity.Chambre;
import com.clean.administration.business.gateway.ChambreRepository;
import com.clean.administration.business.rules.presenter.AfficherLaListeDesChambresPresenter;
import com.clean.administration.business.rules.usecase.RecupererLaListeDesChambres;

import java.util.List;

public class RecupererLaListeDesChambresUseCase implements RecupererLaListeDesChambres {
    AfficherLaListeDesChambresPresenter presenter;
    ChambreRepository respository;

    public RecupererLaListeDesChambresUseCase(AfficherLaListeDesChambresPresenter presenter, ChambreRepository respository) {
        this.presenter = presenter;
        this.respository = respository;
    }


    @Override
    public void execute() {
        List<Chambre> chambres = this.respository.recupererChambres();
        this.presenter.afficherLaListeDesChambres(chambres);
    }
}
