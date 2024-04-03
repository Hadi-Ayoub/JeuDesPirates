package jeu;

public class CaseEffetPosition extends Case{
	
	private TypeCaseEffetPosition type;
	private JournalDeBord jdb;
	

	public CaseEffetPosition(int numCase, TypeCaseEffetPosition type) {
		super(numCase);
		this.type = type;
		jdb = new JournalDeBord();
	}
	
	public TypeCaseEffetPosition getType() {
		return type;
	}
	
	// Case Piège
	public void retournerCaseDepart(Pirate pirate) {
		if (pirate.getPosition() == this.getNumCase()) {	
			pirate.getPion().setPosition(0);
			jdb.afficherRetourDepart(pirate);
		}
	}
	
	
	// Case Switch
	public void echangerPositions(Pirate[] pirates, int pirateCourant) {
		if (pirates[pirateCourant].getPosition() == this.getNumCase()) {
			pirates[pirateCourant].getPion().setPosition(pirates[(pirateCourant +1)% 2 ].getPosition());
			pirates[(pirateCourant + 1 ) % 2 ].getPion().setPosition(pirates[pirateCourant].getPosition());
			jdb.afficherEchangePions(pirates,pirateCourant);
		}
	}
	
	
	// Case Prison
	public boolean bloquerPion(Pirate pirate, int resultatDe) {
		boolean pionBloque = false;
		if (resultatDe == this.getNumCase()) {
			pionBloque = true;
			jdb.annoncerBloquagePion(pirate);
		}
		return pionBloque;
	}
	
	//Case Espoir
	public boolean espererLiberation(Jeu jeu, Pirate pirate, int valeurDe) {
		boolean caseEspoir = false;
		if (pirate.getPosition() == this.getNumCase()) {
			caseEspoir = true;
			jeu.deplacerPion(pirate, (0-valeurDe) );
			jdb.afficherEffetEspoir(pirate, valeurDe);
		}
		return caseEspoir;
	}
	
	
	
	
	
	

}
