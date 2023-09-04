package org.yass.models;

import org.yass.ARisque;

public class ManutARisque extends Manutentionnaire implements ARisque {
    public ManutARisque(String nom, String prenom, int age, String date, int heures) {
        super(nom, prenom, age, date, heures);
    }

    @Override
    public double calculerSalaire() {
        return  super.calculerSalaire()+ prime;
    }
}
