package jeu;

public class Depassement {
	
	
    public static void verifierDepassement(JournalDeBord jdb, Pirate[] pirates, int joueurCourant) {
        Pirate joueurActuel = pirates[joueurCourant];
        Pirate adversaire = pirates[(joueurCourant + 1) % pirates.length];

        if (joueurActuel.getPosition() > adversaire.getPosition()) {
            adversaire.recevoirDegats(1);
            jdb.afficherDepassement(joueurActuel, adversaire);
        }
    }
}


