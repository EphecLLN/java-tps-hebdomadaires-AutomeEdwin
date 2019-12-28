/**
 * 
 */
package tp2;

/**
 * Cette classe modélise une date de manière simplifiée.
 * 
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	private String jour;
	private String mois;
	private String annee;
	
	//GETTERS & SETTERS
	public void setJour(String j){
		this.jour = j;
	}

	public void setMois(String m){
		this.mois = m;
	}

	public void setAnnee(String a){
		this.annee = a;
	}

	public String getJour(){
		return this.jour;
	}

	public String getMois(){
		return this.mois;
	}

	public String getAnne(){
		return this.annee;
	}

	//CONSTRUCTEUR
	public Date(String jj, String mm, String aa){
		this.jour = jj;
		this.mois = mm;
		this.annee = aa;
	}

	//METHODES
	public String toString(){
		return this.jour + "/" + this.mois + "/" + this.annee;
	}
	
	/**
	 * La m�thode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date(args[0], args[1], args[2]);
		System.out.println(d.toString());

	}
}
