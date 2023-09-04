package org.yass.models;

import org.yass.ARisque;

public class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String nom, String prenom, int age, String date, int unites) {
        super(nom, prenom, age, date, unites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+prime;
    }
}
