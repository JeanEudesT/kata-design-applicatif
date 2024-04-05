package com.ddd.administration.business.entity;

public class Prix {
    private static final double MONTANT_PLAFOND = 200;
    private double montant;


    public Prix(double montant) {
        this.montant = montant;
    }

    public Prix toPourcentage(double pourcentage) {
        double nouveauMontant = this.montant * pourcentage;
        if (nouveauMontant > MONTANT_PLAFOND) {
            nouveauMontant = MONTANT_PLAFOND;
        }
        return new Prix(nouveauMontant);
    }

    @Override
    public String toString() {
        return Double.toString(montant);
    }
}
