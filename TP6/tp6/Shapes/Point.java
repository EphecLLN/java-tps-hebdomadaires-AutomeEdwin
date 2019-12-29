package tp6.Shapes;

public class Point extends Shape {

    public Point(int x, int y) {
        super(x, y);
    }

    public double surface() {
        return 0;
    }

    public double perimetre(){
        return 0;
    }

    @Override
    public void agrandit(int facteur) {}

}