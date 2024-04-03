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
		pirate.getPion().setPosition(0);
		jdb.afficherRetourDepart(pirate);
	}
	
	// Case Switch
	
	public void echangerPositions(Pirate[] pirates, int pirateCourant) {
		pirates[pirateCourant].getPion().setPosition(pirates[(pirateCourant +1)% 2 ].getPosition());
		pirates[(pirateCourant + 1 ) % 2 ].getPion().setPosition(pirates[pirateCourant].getPosition());
		jdb.afficherEchangePions(pirates,pirateCourant);
	}
	
	public boolean bloquerPion(Pirate pirate, int resultatDe) {
		boolean pionBloque = false;
		if (resultatDe == this.getNumCase()) {
			pionBloque = true;
			jdb.annoncerBloquagePion(pirate);
		}
		return pionBloque;
	}
	
	
	// Case Prison
	
	
	

}
