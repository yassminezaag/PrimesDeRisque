package org.yass.models;

public class Vendeur extends Commercial{
    private final static double pourcentVendeur = 0.2;
    private final static int bonusVendeur = 400;

    public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
        super(nom, prenom, age, date, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {



        return (getChiffreAffaire()*pourcentVendeur)+bonusVendeur;

    }

    public String getTitre() {
        return "Vendeur";
    }
}
