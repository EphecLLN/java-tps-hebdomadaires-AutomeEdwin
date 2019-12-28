package tp6;

public abstract class Shape{
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

    public static void main(String[] args){
        Point p = new Point(5,3);
		Cercle c = new Cercle(5,3,4);
        Carre ca = new Carre(5,3,4);
        System.out.println(p.toString());
        System.out.println(c.toString());
        System.out.println(ca.toString());
    }
}