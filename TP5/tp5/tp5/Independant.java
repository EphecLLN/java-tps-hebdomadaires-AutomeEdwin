/**
 * 
 */
package tp5;

/**
 * @author edwin
 */
public class Independant extends Personne{
    //Variables d'instances
    private String numTVA;

    //GETTERS ET SETTERS
    public void setNumTVA(String n){
        this.numTVA = n;
    }

    public String getNumTVA(){
        return this.numTVA;
    }

    //CONSTRUCTEUR
    public Independant(String n, String p, int nR, String numTVA){
        super(n, p, nR);
        this.numTVA = numTVA;
    }

    //METHODES
    /**
     * Methode toString pour l'objet Independant
     */
    public String toString() {
	    return "L'indépendant s'appele : " + this.getNom() + " " + this.getPrenom();
    }
}