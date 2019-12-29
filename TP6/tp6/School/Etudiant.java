package tp6.School;


import java.time.LocalDate;
import java.time.Period;

public class Etudiant extends Personne{
    private String matricule;

    // GETTEERS & SETTERS
    public String setMatricule() {
        return "" + this.getDateArrive().getYear() + super.getNom().charAt(0) + super.getPrenom().charAt(0);
    }

    public String getMatricule() {
        return this.matricule;
    }

    // CONSTRUCTEUR
    public Etudiant(String n, String pn, LocalDate naiss, LocalDate arrive) throws DateArriveInvalideException{
        super(n, pn, naiss, arrive);
        this.matricule = setMatricule();;
    }


    //METHODES
    public String toString(){
        return super.toString() + "matricule: " + this.matricule + "\n";
    }
    
    public int getAnciennete(){
        LocalDate today = LocalDate.now();

        Period p = Period.between(getDateArrive(), today);
        return p.getYears();
        
    }

    public LocalDate checkDateArrive(LocalDate dateArrive) throws DateArriveInvalideException{
        if(dateArrive.getYear() < 2000 || dateArrive.getYear() < this.getDateNaissance().getYear() || dateArrive.getYear() > LocalDate.now().getYear()){
            throw new DateArriveInvalideException("Mauvaise Année !");
        }
        return dateArrive;
    }

    @Override
    public void affiche() {
        System.out.println(this.toString());
    }

}