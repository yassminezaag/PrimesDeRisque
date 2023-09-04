package org.yass.models;

public class Manutentionnaire extends Employee{

    private final static double salaireHoraire = 65.0;
    private int heures;

    public Manutentionnaire(String nom, String prenom, int age, String date, int heures) {
        super(nom, prenom, age, date);
        this.heures = heures;
    }

    @Override
    public double calculerSalaire() {
        return salaireHoraire*heures;
    }

    public String getTitre() {
        return "Manutentionnaire";
    }


}
