class Punkt {
    private final double x;
    private final double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "Punkt("+ this.x + "," + this.y + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        Punkt p = new Punkt(3.0, 4.0);
        System.out.println(p);
    }
}