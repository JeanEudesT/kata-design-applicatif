package com.couche.entity;

public class Chambre {
    int etage;
    int numero;
    int prix;

    @Override
    public String toString() {
        return "etage=" + etage + "; numero=" + numero + "; prix=" + prix + " |";
    }

    public Chambre(int etage, int numero, int prix) {
        this.etage = etage;
        this.numero = numero;
        this.prix = prix;
    }
}
