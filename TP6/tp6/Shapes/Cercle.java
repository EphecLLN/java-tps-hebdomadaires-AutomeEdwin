package tp6.Shapes;

public class Cercle extends Shape {
    int r;

    public Cercle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double surface() {
        return this.r*2*Math.PI;
    }

    @Override
    public double perimetre() {
        return Math.pow(this.r, 2)*Math.PI;
    }

    public void agrandit(int facteur){
        this.r *= facteur;
    }
}