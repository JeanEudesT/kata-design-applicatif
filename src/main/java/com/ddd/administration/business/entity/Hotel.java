package com.ddd.administration.business.entity;

import com.ddd.administration.business.entity.Chambre;

import java.util.List;

public class Hotel {
    private final List<Chambre> chambres;

    public Hotel(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public void fixerPrix(double montantDuRDC) {
        Prix prixDuRDC = new Prix(montantDuRDC);
        this.chambres.stream().forEach(chambre -> {
            chambre.fixerPrix(prixDuRDC);
        });
    }

    public List<Chambre> getChambres() {
        return this.chambres;
    }
}
