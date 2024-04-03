package jeu;

public class Pirate {
	private String nom;
	private int pointsDeVie;
	private Pion pion;
	
	
	public Pirate(String nom,Pion pion) {
		this.nom = nom;
		this.pion = pion;
		pointsDeVie = 5;
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
	

	
	

}
