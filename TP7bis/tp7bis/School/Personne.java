package tp7bis.School;

import tp6.Affichable;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personne implements Affichable{
    //Variables d'instance
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private LocalDate dateArrive;

    //GETTERS & SETTERS
    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

    public LocalDate getDateArrive(){
        return this.dateArrive;
    }

    public void setNom(String n){
        this.nom = n;
    }

    public void setPrenom(String pn){
        this.prenom = pn;
    }

    public void setDateNaissance(LocalDate dateNaiss) {
        this.dateNaissance = dateNaiss;
    }

    public void setDateArrive(LocalDate dateA) {
        this.dateArrive = dateA;
    }


    //CONSTRUCTEUR
    public Personne(String n, String pn, LocalDate naiss, LocalDate arrive) {
        this.nom = n;
        this.prenom = pn; 
        this.dateNaissance = naiss;
        this.dateArrive = arrive;
    }


    //METHODES
    public int getAge() {
        LocalDate today = LocalDate.now();

        Period p = Period.between(this.dateNaissance, today);

        return p.getYears();
    }

    public String toString(){
        return "Nom:" + this.nom + "\n" +
        "Prenom: " + this.prenom + "\n" +
        "Age: " + getAge() + " ans\n" +
        "Ancienneté: " + getAnciennete() + " année(s)\n";
    }

    public abstract int getAnciennete();


    public static void main(String[] args) {
        try{
            Etudiant etu = new Etudiant("Autome", "Edwin", LocalDate.of(2000, 10, 06), LocalDate.of(2018, 10, 15));
            etu.affiche();
        } catch (DateArriveInvalideException e){
            System.out.println(e);
        }

        Professeur prof = new Professeur("Tartempion", "Jules", LocalDate.of(1970, 06, 30), LocalDate.of(2000, 05, 17));
        prof.affiche();
    }

}