package jeu;


public class Jeu {
	Plateau plateau;
	Pirate[] pirates;
	int joueurCourant; // indice du joueur courant
	JournalDeBord jdb;
	
	
	public Jeu() {
		plateau = new Plateau();
		plateau.initialiserCasesSpeciales();
		pirates = new Pirate[2];
		plateau.initialiserCasesSpeciales();
		jdb = new JournalDeBord();
		
	}
	
	
	public void deplacerPion(Pirate pirate, int deplacement) {
		int positionCourante = pirate.getPosition();
		pirate.getPion().setPosition(positionCourante += deplacement);
	}
	

	// méthode pour initialiser les joueurs et leurs positions à 0 
	public void initialiserJoueurs(Pirate pirate1, Pirate pirate2) {
		//initialisation des joueurs
		pirates[0] = new Pirate(pirate1.getNom(), pirate1.getPion());
		pirates[1] = new Pirate(pirate2.getNom(), pirate2.getPion());
		//initialisation des positions des joueurs
		pirates[0].getPion().setPosition(0);
		pirates[1].getPion().setPosition(0);
		
	}
	
	
	
	public void changerDeTour() {
	        // Passe au tour du joueur suivant
	        joueurCourant = (joueurCourant + 1) % pirates.length;
	    }
	
	
	public boolean verifierGagnant() {
		 if (pirates[joueurCourant].getPion().getPosition() >= plateau.getTaille()) {
		        return true;
		    }
		 return false;
	}
	
	public void jouerPartie() {
		while(!verifierGagnant()) {
			/*
			if (pirates[joueurCourant].getBloque() == true) {
				jdb.afficherBloquagePion(pirates[joueurCourant]);
				deplacerPion(pirates[joueurCourant], 0);
				pirates[joueurCourant].setBloque(false);
			} else {
			*/
			System.out.println("C'est au tour de " + pirates[joueurCourant].getNom());
            int valeurDe = De.lancerDe();
            boolean pionBloque = plateau.getCasePrison().bloquerPion(pirates[joueurCourant], (pirates[joueurCourant].getPosition()+ valeurDe) );
            if (!pionBloque) {
            deplacerPion(pirates[joueurCourant], valeurDe);
            jdb.afficherLancerDes(pirates[joueurCourant], valeurDe);
            
            // Applications eventuelles des effets des cases spéciales
            
            plateau.getCaseHopital().appliquerEffetHopital(pirates[joueurCourant]);
            plateau.getCaseCdf().appliquerCoupDeFeu(pirates, joueurCourant);
            
            } else {
				deplacerPion(pirates[joueurCourant], 0); // le cas où le pion est bloqué 
				
			}
            
            
            
        	if (verifierGagnant()) {
    			// a mettre dans jdb !!!!!!!!
    			//System.out.println("C'est fini ! "+pirates[joueurCourant].getNom() + " a gagné . ");
    			jdb.afficherPirateGagnant(pirates[joueurCourant]);
    			break;
    								}
        	changerDeTour();
			
		}
		
	}
	
	
	

	
	 
	

}
