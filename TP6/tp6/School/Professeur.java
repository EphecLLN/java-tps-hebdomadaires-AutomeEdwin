package tp6.School;

import java.time.LocalDate;
import java.time.Period;

public class Professeur extends Personne {
    // CONSTRUCTEUR
    public Professeur(String n, String pn, LocalDate naiss, LocalDate arrive) {
        super(n, pn, naiss, arrive);
    }


    public int getAnciennete(){
        LocalDate today = LocalDate.now();

        Period p = Period.between(this.getDateArrive(), today);

        if((this.getDateArrive().getYear() - this.getDateNaissance().getYear()) < 23){
            return p.getYears() - (this.getDateNaissance().getYear() + 23 - this.getDateArrive().getYear()); 
        }

        return p.getYears();
        
    }

    @Override
    public void affiche() {
        System.out.println(this.toString());
    }
}