package com.clean.administration.business.rules;

import com.clean.administration.business.entity.Chambre;
import com.clean.administration.business.gateway.ChambreRepository;
import com.clean.administration.business.rules.usecase.FixerLePrixDuneChambreUseCase;

import java.util.List;

public class FixerLePrixDuneChambre implements FixerLePrixDuneChambreUseCase {

    ChambreRepository repository;

    public FixerLePrixDuneChambre(ChambreRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double prixDuRDC) {
        List<Chambre> chambres = this.repository.recupererChambres();
        chambres.stream().forEach(chambre -> {
            chambre.fixerPrix(prixDuRDC);
        });

        this.repository.sauvegarderLesChambres(chambres);
    }
}
