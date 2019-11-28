package tp4;

/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @author vvandens
 *
 */
public class Calculatrice {
	
	double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice
	
	
	//METHODES
	public boolean equals(Calculatrice obj) {
	    return this.valeurCourante == obj.valeurCourante;
	}
	
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	void ajoute(double n) {
		valeurCourante+=n;
	}
	
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	void soustrait(double n) {
		valeurCourante-=n;
	}
	
	/**
	 * Multiplie la valeur courante par un nombre
	 * @param n le multiplicateur
	 */
	void multi(int n) {
	    valeurCourante*=n;
	}
	
	/**
	 * Elève la valeur courante au carré
	 */
	void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		Calculatrice myCalc2 = new Calculatrice();
		myCalc.ajoute(5);
		myCalc2.ajoute(5);
		myCalc.soustrait(2);
		myCalc2.soustrait(2);
		if(myCalc.equals(myCalc2)) {
		    
		}
		System.out.println(myCalc.valeurCourante);
	}
}
