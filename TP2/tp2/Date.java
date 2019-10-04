/**
 * 
 */
package tp2;



/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	int jour;
	int mois;
	int annee;
	
	/**
	 * La m�thode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.annee = Integer.parseInt(args[2]);
	}
}
