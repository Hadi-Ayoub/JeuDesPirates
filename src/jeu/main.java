package jeu;

public class main {

	public static void main(String[] args) {
		Jeu jeu = new Jeu();
	
		Pion pion1 = new Pion();
		Pion pion2 = new Pion();
		Pirate pirate1 = new Pirate("Jack Le Borgne",pion1);
		Pirate pirate2 = new Pirate("Bill Jambe de Bois",pion2);
		jeu.initialiserJoueurs(pirate1, pirate2);
		/*
		System.out.println(" position pirate1 : " +pirate1.getPosition());
		System.out.println("hp intial: "+ pirate1.getHp());
		
		CaseEffetHP caseHopital = new CaseEffetHP(5, TypeCaseHp.HOPITAL);
		jeu.deplacerPion(pirate1, 5);
		
		System.out.println(pirate1.getPosition());
		System.out.println(pirate1.getHp());
		*/
		jeu.jouerPartie();
		
	}

}



