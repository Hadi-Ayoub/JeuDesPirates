package jeu;

public abstract class Case {
	private int numCase;
	
	public Case(int numCase) {
		this.numCase = numCase;
	}
	
	public int getNumCase() {
		return numCase;
	}
	
	public void setNumCase(int newPosition) {
	      this.numCase = newPosition;
	  }
}
