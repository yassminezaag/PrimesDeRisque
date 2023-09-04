package org.yass.models;

public class Representant extends Commercial{
    private final static double pourcentRep = 0.2;
    private final static int bonusRep = 800;
    public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
        super(nom, prenom, age, date, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {

        return (getChiffreAffaire()*pourcentRep)+bonusRep;

    }

    public String getTitre() {
        return "Representant";
    }
}
