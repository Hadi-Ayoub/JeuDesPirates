package jeu;
import java.security.SecureRandom;
import java.util.Scanner;


public class De {
	public static int lancerDe() {
	    Scanner scanner = new Scanner(System.in);

	    // Affichage d'un message pour demander à l'utilisateur de lancer le dé
	    System.out.println("Appuyez sur Entrée pour lancer le dé...");     
	    scanner.nextLine();// !!!! a mettre dans la classe JDB 
		SecureRandom random = new SecureRandom();
		int premierDe = random.nextInt(6) + 1;
		int deuxiemeDe = random.nextInt(6) + 1;
		return premierDe + deuxiemeDe;
	}

}
