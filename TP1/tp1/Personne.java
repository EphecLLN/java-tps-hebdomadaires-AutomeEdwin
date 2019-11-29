/**
 * 
 */
package tp1;

/**
 * @author edwin
 *
 */
public class Personne {

    private String nom;
    private String prenom;
    
    //GETTERS & SETTERS
    public String getNom() {
	return this.nom;
    }
    
    public String getPrenom() {
	return this.prenom;
    }
        
    public void setNom(String n) {
	this.nom = n;
    }
    
    public void setPrenom(String p) {
	this.prenom = p;
    }
    
    //CONSTRUCTEURS
    /**
     * Constructeur par défaut de l'objet Personne
     */
    public Personne() {
	this.nom = "Tartempion";
	this.prenom = "Jules";
    }
    
    /**
     * Constructeur avec parametres de l'objet Personne
     * @param n nom de la personne
     * @param p prenom de la personne
     */
    public Personne(String n, String p) {
	this.nom = n;
	this.prenom = p;
    }
    
    //METHODES
    /**
     * Methode toString pour l'objet Personne
     */
    public String toString() {
	return "La personne s'appele : " + this.nom + " " + this.prenom;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Personne pers = new Personne("Autome", "Edwin");
	Personne pers2 = new Personne();
	System.out.println(pers.toString());
	System.out.println(pers2.toString());
    }

}
