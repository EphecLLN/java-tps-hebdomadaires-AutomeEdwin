/**
 * 
 */
package tp5;

/**
 * @author edwin
 */
public class Employe extends Personne{
    //Variables d'instances
    private int salaire;
    private String employeur;

    //SETTERS ET GETTERS
    public void setSalaire(int sal){
        this.salaire = sal;
    }

    public void SetEmployeur(String emp){
        this.employeur = emp;
    }

    public int getSalaire(){
        return this.salaire;
    }

    public String getEmployeur(){
        return this.employeur;
    }

    //CONSTRUCTEUR
    public Employe(String n, String p, int nR, String emp, int sal){
        super(n, p, nR);
        this.salaire = sal;
        this.employeur = emp;
    }

    //METHODES
    /**
     * Methode toString pour l'objet Employe
     */
    public String toString() {
	    return "L'employé s'appele : " + this.getNom() + " " + this.getPrenom();
    }

}