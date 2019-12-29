package tp6.Shapes;

import tp6.Affichable;
import tp6.Transformable;

public abstract class Shape implements Affichable, Transformable{
    private static int id = 0;
    private int absX;
    private int ordY;

    public Shape(int x, int y) {
        this.absX = x;
        this.ordY = y;
        Shape.id++;
    }

    public String getNom(){
        return this.getClass().getSimpleName() + Shape.id;
    }

    public abstract double surface();
    public abstract double perimetre();

    public String toString(){
        return "" + this.getNom() + "\n" + 
        "emplacement: " + "\n" +
        "périmètre: " + this.perimetre() + "\n" +
        "surface: " + this.surface() + "\n";
    }

    public void affiche(){
        System.out.println(this.toString());
    }

    public void deplace(int deltaX, int deltaY){
        this.absX += deltaX;
        this.ordY += deltaY;
    }

    public abstract void agrandit(int facteur);

    public static void main(String[] args){
        Point p = new Point(4, 8);
        p.affiche();
        p.deplace(2, 2);
        p.agrandit(2);
        p.affiche();

        Cercle c = new Cercle(1,2,3);
        c.affiche();
        c.deplace(2, 2);
        c.agrandit(2);
        c.affiche();

        Carre ca = new Carre(3, 2, 1);
        ca.affiche();
        ca.deplace(2, 2);
        ca.agrandit(2);
        ca.affiche();

    }
}