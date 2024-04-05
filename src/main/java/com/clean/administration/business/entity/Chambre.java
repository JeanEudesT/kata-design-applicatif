package com.clean.administration.business.entity;

public class Chambre {
    int etage;
    int numero;
    double prix;

    public Chambre(int etage, int numero, double prix) {
        this.etage = etage;
        this.numero = numero;
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "etage=" + etage + "; numero=" + numero + "; prix=" + prix + " |";
    }

    public void fixerPrix(double prixDuRDC) {
        if (this.etage == 1) {
            this.prix = prixDuRDC * 1.07;
        } else if (this.etage == 2) {
            this.prix = prixDuRDC * 1.22;
        } else if (this.etage == 3) {
            this.prix = prixDuRDC * 1.33;
        } else if (this.etage == 0) {
            this.prix = prixDuRDC;
        }

        if (this.prix > 200) {
            this.prix = 200;
        }
    }
}
