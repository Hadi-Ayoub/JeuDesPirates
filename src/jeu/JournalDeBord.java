package jeu;

public class JournalDeBord implements IAffichage{

	@Override
	public void afficherLancerDes(Pirate pirate, int valeur) {
		if (pirate.getPosition()  < 30) {
		System.out.println("Le pirate " + pirate.getNom() + " a lancé les dés et a obtenu une valeur totale de "+ valeur+", vous"
				+ " avancer donc à la case "+ pirate.getPosition());
		} else {
			System.out.println("Le pirate "+ pirate.getNom() + " a lancé les dés et a obtenu une valeur totale de "+ valeur + " il est donc arrivé à la case finale");
		}
	}

	@Override
	public void afficherDepassement(Pirate pirate1, Pirate pirateDepasse) {
		System.out.println("Vous avez dépassé "+ pirateDepasse.getNom()+ ". Malheureseuement pour vous " + pirateDepasse.getNom()+ " vous perder 1 point de vie.");
	}

	@Override
	public void afficherEffetEspoir(Pirate pirate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherEffetHopital(Pirate pirate) {
		System.out.println("Votre pirate "+ pirate.getNom()+ " est tombé sur la case Hôpital, il gagne donc 1 HP. Il a maintenant "+ pirate.getHp() + " HP.");
		
	}
	
	@Override
	public void annoncerBloquagePion(Pirate pirate) {
		System.out.println("Oups ! Le pirate "+ pirate.getNom() + " est emprisonné, son pion sera bloqué pendant ce tour ! ");
		
	}

	@Override
	public void afficherBloquagePion(Pirate pirate) {
		System.out.println("C'est au tour de "+pirate.getNom() + " de joueur mais il est bloqué, son pion ne sera pas déplacé dans ce tour ! ");
		
	}
	


	@Override
	public void afficherPirateGagnant(Pirate pirate) {
		System.out.println("C'est fini ! "+pirate.getNom() + " a gagné . ");
		
	}

	@Override
	public void afficherRetourDepart(Pirate pirate) {
		System.out.println("Votre pirate "+ pirate.getNom()+ " est tombé sur la case Piège, il retourne donc à la case de départ.");
		
	}

	@Override
	public void afficherEchangePions(Pirate[] pirates, int pirateCourant) {
		System.out.println("Votre pirate "+ pirates[pirateCourant].getNom() + " est tombé sur la case Switch, les deux pirates échange de positions.\n "+ 
				pirates[pirateCourant].getNom()+ "est à la case "+ pirates[pirateCourant].getPosition()+"\n" + 
				pirates[(pirateCourant+1)%2].getNom()+ "est à la case "+ pirates[(pirateCourant+1)%2].getPosition());
	}

	@Override
	public void afficherCoupDeFeu(Pirate adversaire) {
		System.out.println(adversaire.getNom() + " reçoit un violent coup de feu à la suit duquel il perd 1 HP. Il lui reste " + adversaire.getHp() + " HP." );
		
	}


	

	
	
	
	
	

}
