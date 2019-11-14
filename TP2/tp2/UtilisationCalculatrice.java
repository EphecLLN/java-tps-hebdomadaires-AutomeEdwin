package tp2;

public class UtilisationCalculatrice {
    
    public static void main(String[] args) {
	
	Calculatrice myCalc;

	myCalc = new Calculatrice();

	myCalc.ajoute(5);
	System.out.println(myCalc.getValeurCourante());

    }
}