package jeu;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	private List<Case> cases;
	private final int TAILLE = 30;
	
	public Plateau() {
		cases = new ArrayList<>(TAILLE);	
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
	
	public CaseEffetPosition getCaseEspoir() {
		for (Case c : cases) {
	        if (c instanceof CaseEffetPosition && ((CaseEffetPosition) c).getType() == TypeCaseEffetPosition.ESPOIR) {
	            return (CaseEffetPosition) c;
	        }
	    }
	    return null;
	}
	
	public CaseEffetPosition getCaseSwitch() {
		for (Case c : cases) {
	        if (c instanceof CaseEffetPosition && ((CaseEffetPosition) c).getType() == TypeCaseEffetPosition.SWITCH) {
	            return (CaseEffetPosition) c;
	        }
	    }
	    return null;
	}
	
	public CaseEffetPosition getCasePiege() {
		for (Case c : cases) {
	        if (c instanceof CaseEffetPosition && ((CaseEffetPosition) c).getType() == TypeCaseEffetPosition.PIEGE) {
	            return (CaseEffetPosition) c;
	        }
	    }
	    return null;
	}

	
	public void initialiserCasesSpeciales() {
		CaseEffetHP caseHopital = new CaseEffetHP(12,TypeCaseHp.HOPITAL);
		CaseEffetHP caseCdf = new CaseEffetHP(3, TypeCaseHp.COUP_DE_FEU);
		
		CaseEffetPosition casePrison = new CaseEffetPosition(8, TypeCaseEffetPosition.PRISON);
		CaseEffetPosition casePiege = new CaseEffetPosition(18, TypeCaseEffetPosition.PIEGE);
		CaseEffetPosition caseSwitch = new CaseEffetPosition(25, TypeCaseEffetPosition.SWITCH);
		CaseEffetPosition caseEspoir = new CaseEffetPosition(29, TypeCaseEffetPosition.ESPOIR);
		
		
		cases.add(caseHopital);
		cases.add(caseCdf);
		
		cases.add(casePrison);
		cases.add(casePiege);
		cases.add(caseSwitch);
		cases.add(caseEspoir);
	}
	
	
	
	   
	}
	


