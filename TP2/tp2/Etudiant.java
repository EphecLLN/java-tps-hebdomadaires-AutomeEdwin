package tp2;


/**
 * Classe permettant la repr�sentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prenom;
	private String matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;

	//GETTERS & SETTERS
	public void setNom(String n){
		this.nom = n;
	}

	public void setPrenom(String pn){
		this.prenom = pn;
	}

	public void setMatricule(String matr) {
		this.matricule = matr;
	}

	public void setDateNaissance(Date d){
		this.dateNaissance = d;
	}

	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}

	public String getMatricule(){
		return this.matricule;
	}

	public Date getDateNaissance(){
		return this.dateNaissance;
	}

	//CONSTRUCTEUR
	public Etudiant(String n, String pn, String matr, Date d){
		this.nom = n;
		this.prenom = pn;
		this.matricule = matr;
		this.dateNaissance = d;
	}

	//METHODES
	public String toString(){
		return "L'étudiant " + this.matricule + " s'appelle " + this.nom + " " + this.prenom + " et est né le " + this.dateNaissance;
	}

	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant(args[0], args[1], args[2], new Date(args[3], args[4], args[5]));
		System.out.println(etu.toString());

	}

}
