package jeu;




public class CaseEffetHP extends Case{
	
	
	private TypeCaseHp type;
	private JournalDeBord jdb;
	

	public CaseEffetHP(int numCase, TypeCaseHp type) {
		super(numCase);
		this.type = type;
		jdb = new JournalDeBord();
	}
	
	
	// Case Hôpital
	public void augmenterHP(Pirate pirate) {
		//int hpActuel = pirate.getHp();
		pirate.setHp(pirate.getHp() + 1);
	}
	
	//Case coup de feu
	public void infligerDegats(Pirate adversaire) {
		//Pirate adversaire = getAdversaire(pirate);
		adversaire.recevoirDegats(1);
		
	}
	
	
	public boolean appliquerEffetHopital(Pirate pirateCourant) {
		boolean effetApplique = false;
		if (pirateCourant.getPosition() == this.getNumCase()) {
			augmenterHP(pirateCourant);
			effetApplique = true;
			jdb.afficherEffetHopital(pirateCourant);
		}
		
		return effetApplique;
	}
	
	
	public void appliquerCoupDeFeu(Pirate[] pirates,int pirateCourant) {
		if (pirates[pirateCourant].getPosition() == this.getNumCase()) {
			infligerDegats(pirates[(pirateCourant + 1) % 2]);
			jdb.afficherCoupDeFeu(pirates[(pirateCourant + 1) % 2]);
			}
	
	}
	
	public TypeCaseHp getType() {
		return type;
	}
	
	/*
	 
	public boolean appliquerEffetHopital(Pirate pirate1, Pirate pirate2, int positionHopital) {
		boolean effetApplique = false;
		if (pirate1.getPosition() == positionHopital) {
			augmenterHP(pirate1);
			effetApplique = true;
		} else if (pirate2.getPosition() == positionHopital) {
			augmenterHP(pirate2);
			effetApplique = true;
		}
		return effetApplique;
	}
	*/

	
	

}
