package com.hexa.core.application;

public class Chambre {
    int etage;
    int numero;
    double prix;

    public Chambre(int etage, int numero, double prix) {
        this.etage = etage;
        this.numero = numero;
        this.prix = prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getEtage() {
        return this.etage;
    }

    @Override
    public String toString() {
        return "etage=" + etage + "; numero=" + numero + "; prix=" + prix + " |";
    }
}
