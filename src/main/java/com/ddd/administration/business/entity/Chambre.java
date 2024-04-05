package com.ddd.administration.business.entity;

public class Chambre {
    Etage etage;
    int numero;
    Prix prix;

    public Chambre(Etage etage, int numero, Prix prix) {
        this.etage = etage;
        this.numero = numero;
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "etage=" + etage + "; numero=" + numero + "; prix=" + prix + " |";
    }

    public void fixerPrix(Prix prixDuRDC) {
        double pourcentageDeLEtage = this.etage.getPourcentage();
        this.prix = prixDuRDC.toPourcentage(pourcentageDeLEtage);
    }
}
