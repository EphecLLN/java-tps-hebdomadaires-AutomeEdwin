/**
 * 
 */
package tp5;

import java.lang.String;

/**
 * @author edwin
 *
 */
public class Personne {

    private String nom;
    private String prenom;
    private int natReg;
    
    //GETTERS & SETTERS
    public String getNom() {
	return this.nom;
    }
    
    public String getPrenom() {
	return this.prenom;
    }

    public int getNatReg(){
        return this.natReg;
    }
        
    public void setNom(String n) {
	this.nom = n;
    }
    
    public void setPrenom(String p) {
	this.prenom = p;
    }

    public void setNatReg(int nR){
        this.natReg = nR;
    }
    
    //CONSTRUCTEURS
    /**
     * Constructeur par défaut de l'objet Personne
     */
    public Personne() {
	    this.nom = "Tartempion";
        this.prenom = "Jules";
        this.natReg = 123456;
    }
    
    /**
     * Constructeur avec parametres de l'objet Personne
     * @param n nom de la personne
     * @param p prenom de la personne
     */
    public Personne(String n, String p, int nR) {
	    this.nom = n;
        this.prenom = p;
        this.natReg = nR;
    }
    
    //METHODES
    /**
     * Methode toString pour l'objet Personne
     */
    public String toString() {
	    return "La personne s'appele : " + this.nom + " " + this.prenom;
    }

    public boolean equals(Personne p){
        return (this == p);
    }

    public int compareTo(){
        return 0;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	    Personne pers = new Personne("Jules", "Dupont", 123234);
        Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
        Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
        System.out.println(pers);
        System.out.println(emp);
        System.out.println(ind);
    }
}
