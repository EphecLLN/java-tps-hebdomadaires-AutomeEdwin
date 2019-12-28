package tp6;

public class Carre extends Shape {
    int longueur;

    public Carre(int x, int y, int l) {
        super(x, y);
        this.longueur = l;
    }

    @Override
    public double surface() {
        return Math.pow(longueur, 2);
    }

    @Override
    public double perimetre() {
        return longueur*4;
    }

}