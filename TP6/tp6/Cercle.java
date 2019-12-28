package tp6;

public class Cercle extends Shape {
    int rayon;

    public Cercle(int x, int y, int r) {
        super(x, y);
        this.rayon = r;
    }

    @Override
    public double surface() {
        return this.rayon*2*Math.PI;
    }

    @Override
    public double perimetre() {
        return Math.pow(this.rayon, 2)*Math.PI;
    }

}