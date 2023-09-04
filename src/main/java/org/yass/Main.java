package org.yass;

import org.yass.models.*;

public class Main {
    public static void main(String[] args) {

        Personnel p = new Personnel();


        Technicien tech1 = new Technicien("mohamed","ben selem",30,"2010",1000);
        Vendeur vend1 = new Vendeur("salim","mansour",62,"2003",30000);
        Representant rep1 = new Representant("behija","boumiza",54,"1999",20000);
        Manutentionnaire mant1 = new Manutentionnaire("mahmoud","mahmoudi",50,"2001",45);
        TechnARisque technAR1 = new TechnARisque("ibrahim","ben henia",35,"2008",1000);
        ManutARisque manutAR1 = new ManutARisque("Bouhmid","ben yahia",26,"2014",45);

        p.ajouterEmploye(tech1);
        p.ajouterEmploye(vend1);
        p.ajouterEmploye(rep1);
        p.ajouterEmploye(mant1);
        p.ajouterEmploye(technAR1);
        p.ajouterEmploye(manutAR1);

        p.calculerSalaires();

        double salaireMoyen = p.salaireMoyen();
        System.out.println("Le salaire moyen dans l'entreprise est de "+salaireMoyen+" Dinars");


    }
}