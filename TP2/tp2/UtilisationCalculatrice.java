package tp2;

public class UtilisationCalculatrice {
    
    public static void main(String[] args) {
	
	Calculatrice myCalc = new Calculatrice();

	myCalc.ajoute(10);
	System.out.println(myCalc.getValeurCourante());
    }
}