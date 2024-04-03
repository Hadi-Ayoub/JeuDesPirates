package jeu;

public class Pirate {
	private String nom;
	private int pointsDeVie;
	private Pion pion;
	private boolean possibiliteAvancement = true;
	
	
	public Pirate(String nom,Pion pion) {
		this.nom = nom;
		this.pion = pion;
		pointsDeVie = 10;
	}
	
	public void recevoirDegats(int degat) {
		pointsDeVie -= degat;
	}
	
	public int getPosition() {
		return pion.getPosition();
	}
	
	public Pion getPion() {
		return pion;
	}
	
	public int getHp() {
		return pointsDeVie;
	}
	
	public void setHp(int hP) {
		pointsDeVie = hP;
	}
	
	public String getNom() {
		return nom;
	}
	
	public boolean getPossibiliteDeplacement() {
		return possibiliteAvancement;
	}
	
	public void setPossibiliteAvancement(boolean possibilite) {
		possibiliteAvancement = possibilite;
	}

	
	

}
