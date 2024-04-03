package jeu;

public class JournalDeBord implements IAffichage{

	@Override
	public void afficherAvancement(Pirate pirate, int valeur) {
		if (pirate.getPosition()  < 30) {
		System.out.println("Le pirate " + pirate.getNom() + " a lancé les dés et a obtenu une valeur totale de "+ valeur+", vous"
				+ " avancer donc à la case "+ pirate.getPosition());
		} else {
			System.out.println("Le pirate "+ pirate.getNom() + " a lancé les dés et a obtenu une valeur totale de "+ valeur + " il est donc arrivé à la case finale");
		}
		
		
	}

	@Override
	public void afficherDepassement(Pirate pirate1, Pirate pirateDepasse) {
		System.out.println("Le pirate "+ pirate1.getNom() + " a dépassé "+ pirateDepasse.getNom()+ ". Malheureseuement pour vous " + pirateDepasse.getNom()+ " vous perder 1 point de vie.\n"
				+ pirateDepasse.getNom()+", il vous reste "+ pirateDepasse.getHp() + " HP");
	}

	@Override
	public void afficherEffetEspoir(Pirate pirate, int valeurDe) {
		System.out.println("Le pirate " + pirate.getNom() + " est tombé sur la case 29, il reculera de "+ valeurDe + " cases. Il est maintenant sur la case "+ pirate.getPosition() + " Il y'a toujours de l'espoir !\n" );
		
	}

	@Override
	public void afficherEffetHopital(Pirate pirate) {
		System.out.println("Votre pirate "+ pirate.getNom()+ " est tombé sur la case Hôpital, il gagne donc 1 HP. Il a maintenant "+ pirate.getHp() + " HP.\n");
		
	}
	
	@Override
	public void annoncerBloquagePion(Pirate pirate) {
		System.out.println("Oups ! Le pirate "+ pirate.getNom() + " est emprisonné, son pion sera bloqué pendant ce tour ! \n");
		
	}

	@Override
	public void afficherBloquagePion(Pirate pirate) {
		System.out.println("C'est au tour de "+pirate.getNom() + " de joueur mais il est bloqué, son pion ne sera pas déplacé dans ce tour ! \n");
		
	}
	


	@Override
	public void afficherPirateGagnant(Pirate pirate) {
		System.out.println("C'est fini ! "+pirate.getNom() + " a gagné . ");
		
	}

	@Override
	public void afficherRetourDepart(Pirate pirate) {
		System.out.println("Votre pirate "+ pirate.getNom()+ " est tombé sur la case Piège, il retourne donc à la case de départ.\n");
		
	}

	@Override
	public void afficherEchangePions(Pirate[] pirates, int pirateCourant) {
		System.out.println("Votre pirate "+ pirates[pirateCourant].getNom() + " est tombé sur la case Switch, les deux pirates échange de positions.\n"+ 
				pirates[pirateCourant].getNom()+ " est à la case "+ pirates[pirateCourant].getPosition()+"\n" + 
				pirates[(pirateCourant+1)%2].getNom()+ " est à la case "+ pirates[(pirateCourant+1)%2].getPosition());
	}

	@Override
	public void afficherCoupDeFeu(Pirate adversaire) {
		System.out.println(adversaire.getNom() + " reçoit un violent coup de feu à la suit duquel il perd 1 HP. Il lui reste " + adversaire.getHp() + " HP.\n" );
		
	}

	@Override
	public void afficherImpossibliteDeplacement(Pirate pirate, int val) {
		System.out.println("Le déplacement n'est pas possible pour " + pirate.getNom() +" , il reste sur la case" + val + "\n");
		
	}


	

	
	
	
	
	

}
