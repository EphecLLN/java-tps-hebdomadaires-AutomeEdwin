package tp2;


/**
 * Classe permettant la repr�sentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	String nom;
	String prenom;
	int matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	Date dateNaissance;
	
	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.annee = Integer.parseInt(args[5]);
	}

}
