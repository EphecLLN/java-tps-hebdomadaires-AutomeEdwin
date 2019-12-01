/**
 * 
 */
package tp1;

/**
 * @author edwin
 *
 */
public class Livres {

    // VARIABLES D'INSTANCE
    String titre;
    String auteurNom;
    String isbn;

    /**
     * @param args
     */
    public static void main(String[] args) {
	Livres livre = new Livres();
	livre.titre = "Metro 2033";
	livre.auteurNom = "Glukhosky";
	livre.isbn = "8975768567";

	System.out.println("titre: " + livre.titre + "\n auteur: " + livre.auteurNom + "\n isbn: " + livre.isbn);
    }
}
