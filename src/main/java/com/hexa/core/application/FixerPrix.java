package com.hexa.core.application;

import com.hexa.core.port.serverside.ForRecupererChambre;
import com.hexa.core.port.serverside.ForSauvegarderChambre;
import com.hexa.core.port.userside.ForFixerPrixDesChambres;

import java.util.List;

public class FixerPrix implements ForFixerPrixDesChambres {
    private ForRecupererChambre recupererChambre;
    private ForSauvegarderChambre sauvegarderChambre;

    public FixerPrix(ForRecupererChambre recupererChambre, ForSauvegarderChambre sauvegarderChambre) {
        this.recupererChambre = recupererChambre;
        this.sauvegarderChambre = sauvegarderChambre;
    }

    @Override
    public void fixerLePrixDesChambres(double prixDuRDC) {
        List<Chambre> chambres = this.recupererChambre.recupererChambres();
        chambres.stream().forEach(chambre -> {
            double nouveauPrix = prixDuRDC;
            if (chambre.getEtage() == 1) {
                nouveauPrix = prixDuRDC * 1.07;
            } else if (chambre.getEtage() == 2) {
                nouveauPrix = prixDuRDC * 1.22;
            } else if (chambre.getEtage() == 3) {
                nouveauPrix = prixDuRDC * 1.33;
            } else if (chambre.getEtage() == 0) {
                nouveauPrix = prixDuRDC;
            }

            if (nouveauPrix > 200) {
                nouveauPrix = 200;
            }
            chambre.setPrix(nouveauPrix);

        });
        this.sauvegarderChambre.sauvegarderLesChambres(chambres);
    }
}
