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
	    int distanceRestante = plateau.getTaille() - positionCourante;
	    
	    // Vérifier si le déplacement est valide en fonction de la position actuelle
	    if (distanceRestante < deplacement || positionCourante >= plateau.getTaille() - 1) {
	    	pirate.setPossibiliteAvancement(false);
	        System.out.println("Vous ne pouvez pas avancer !");
	        return;
	    }else {
	    	pirate.getPion().setPosition(positionCourante += deplacement);
	    }
	   
	    
	    
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
		 if (pirates[joueurCourant].getPion().getPosition() >= plateau.getTaille() || pirates[(joueurCourant + 1) % pirates.length].getHp() == 0 ) {
		        return true;
		    }
		 return false;
	}
	

	
	
	public void jouerPartie() {
		while(!verifierGagnant()) {
		
			System.out.println("C'est au tour de " + pirates[joueurCourant].getNom());
            int valeurDe = De.lancerDe();
            // test case Prison après le lancement des dés
            boolean pionBloque = plateau.getCasePrison().bloquerPion(pirates[joueurCourant], (pirates[joueurCourant].getPosition()+ valeurDe) );
            
            boolean caseEspoir = plateau.getCaseEspoir().espererLiberation(this, pirates[joueurCourant], valeurDe); // déplacement gérée par la case elle même 
            
            if (!pionBloque && !caseEspoir) {
            	/*
            		deplacerPion(pirates[joueurCourant], valeurDe);
            		jdb.afficherAvancement(pirates[joueurCourant], valeurDe);
            */
            	
            	 int positionAvantDeplacement = pirates[joueurCourant].getPosition();
            	 deplacerPion(pirates[joueurCourant], valeurDe);
            	 int positionApresDeplacement = pirates[joueurCourant].getPosition();
            	    
            	 if (positionApresDeplacement == positionAvantDeplacement) {
            		 jdb.afficherImpossibliteDeplacement(pirates[joueurCourant], positionAvantDeplacement);
            	 } else {
            	        // Afficher l'avancement seulement si le déplacement est possible
            	     jdb.afficherAvancement(pirates[joueurCourant], valeurDe);
            	    }
            // Applications eventuelles des effets des cases spéciales
            
            		plateau.getCaseHopital().appliquerEffetHopital(pirates[joueurCourant]); //  case Hôpital
            		plateau.getCaseCdf().appliquerCoupDeFeu(pirates, joueurCourant); // test case Coup de Feu
            		
            		plateau.getCaseSwitch().echangerPositions(pirates, joueurCourant);
            		plateau.getCasePiege().retournerCaseDepart(pirates[joueurCourant]);
            		
            		Depassement.verifierDepassement(jdb, pirates, joueurCourant);
            		
            
            	} else if(pionBloque && !caseEspoir) {
            		deplacerPion(pirates[joueurCourant], 0); // le cas où le pion est bloqué : case Prison
				
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
