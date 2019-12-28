/**
 * 
 */
package tp2;

/**
 * @author edwin
 *
 */
public class Livres {

    // VARIABLES D'INSTANCE
    private String titre;
    private String auteurNom;
    private String isbn;

    //GETTERS & SETTERS
    public void setTitre(String t){
        this.titre = t;
    }

    public void setAuteurNom(String aN){
        this.auteurNom = aN;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getAuteurNom(){
        return this.auteurNom;
    }

    public String getISBN(){
        return this.isbn;
    }

    //CONSTRUCTEUR
    public Livres(String t, String aN, String isbn){
        this.titre = t;
        this.auteurNom = aN;
        this.isbn = isbn;
    }

    //METHODES
    public String toString(){
        return "titre: " + this.titre + "\nauteur: " + this.auteurNom + "\nisbn: " + this.isbn;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	    Livres livre = new Livres(args[0], args[1], args[2]);
	    System.out.println(livre.toString());
    }
}
