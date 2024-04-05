package com.ddd.administration.business.entity;

import java.util.Map;

public class Etage {
    Map<Integer, Double>  pourcentages;
    int etage;

    public Etage(int etage, Map<Integer, Double> percentages) {
        this.etage = etage;
        this.pourcentages = percentages;

    }

    @Override
    public String toString() {
        return Integer.toString(etage);
    }

    public double getPourcentage() {
        return pourcentages.get(etage);
    }
}
