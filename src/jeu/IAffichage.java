package jeu;

public interface IAffichage {
	
	public void afficherLancerDes(Pirate pirate, int valeur);
	public void afficherDepassement(Pirate pirate1, Pirate pirateDepasse);
	public void afficherEffetEspoir(Pirate pirate);
	public void afficherEffetHopital(Pirate pirate);
	public void annoncerBloquagePion(Pirate pirate);
	public void afficherBloquagePion(Pirate pirate);
	public void afficherPirateGagnant(Pirate pirate);
	public void afficherRetourDepart(Pirate pirate);
	public void afficherEchangePions(Pirate[] pirates, int pirateCourant);
	public void afficherCoupDeFeu(Pirate adversaire);
	
	

	
	

}
