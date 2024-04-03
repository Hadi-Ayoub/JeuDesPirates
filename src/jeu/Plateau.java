package jeu;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	private List<Case> cases;
	private final int TAILLE = 30;
	
	public Plateau() {
		cases = new ArrayList<>(TAILLE);	
	}
	
	
	/*
	public void deplacerPion(Pirate pirate, int deplacement) {
		int positionCourante = pirate.getPosition();
		pirate.getPion().setPosition(positionCourante += deplacement);
	}
	*/
	
	
	//utilité à revoir
	public Case getCase(int numCase) {
		for (Case c : cases) {
			if (c.getNumCase() == numCase) {
				return c;
			}
		}
		return null;
	}
	
	
	
	public int getTaille() {
		return TAILLE;
	}

	
	
	public CaseEffetHP getCaseHopital() {
	    for (Case c : cases) {
	        if (c instanceof CaseEffetHP && ((CaseEffetHP) c).getType() == TypeCaseHp.HOPITAL) {
	            return (CaseEffetHP) c;
	        }
	    }
	    return null;
	}
	
	
	
	public CaseEffetHP getCaseCdf() {
		for (Case c : cases) {
	        if (c instanceof CaseEffetHP && ((CaseEffetHP) c).getType() == TypeCaseHp.COUP_DE_FEU) {
	            return (CaseEffetHP) c;
	        }
	    }
	    return null;
	}
	
	
	public CaseEffetPosition getCasePrison() {
		for (Case c : cases) {
	        if (c instanceof CaseEffetPosition && ((CaseEffetPosition) c).getType() == TypeCaseEffetPosition.PRISON) {
	            return (CaseEffetPosition) c;
	        }
	    }
	    return null;
	}

	
	public void initialiserCasesSpeciales() {
		CaseEffetHP caseHopital = new CaseEffetHP(12,TypeCaseHp.HOPITAL);
		CaseEffetHP caseCdf = new CaseEffetHP(19, TypeCaseHp.COUP_DE_FEU);
		CaseEffetPosition casePrison = new CaseEffetPosition(21, TypeCaseEffetPosition.PRISON);
		
		
		
		cases.add(caseHopital);
		cases.add(caseCdf);
		cases.add(casePrison);
		
	}
	
	
	
	   
	}
	


