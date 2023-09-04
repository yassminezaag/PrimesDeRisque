package org.yass.models;

public class Technicien extends Employee{

    private final static double facteurUnite = 5.0;
    private int unites;

    public Technicien(String nom, String prenom, int age, String date, int unites) {
        super(nom, prenom, age, date);
        this.unites = unites;
    }

    @Override
    public double calculerSalaire() {

        return facteurUnite*unites;
    }

    public String getTitre(){
        return "Technicien";
    }

    @Override
    public String toString() {
        return "Technicien{" +
                "unites=" + unites +
                "} " + super.toString();
    }
}
