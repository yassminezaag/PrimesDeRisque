package org.yass.models;

abstract class Commercial extends Employee {
    private double chiffreAffaire;

    public Commercial(String nom, String prenom, int age, String date, double chiffreAffaire) {
        super(nom, prenom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
}
