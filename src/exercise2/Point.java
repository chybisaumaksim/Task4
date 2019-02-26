package exercise2;

public class Point extends Triangle {

    private double x;
    private double y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public static double calculateDistanceBetweenPoints(Point one, Point two) {
        return Math.sqrt(Math.pow(one.getX() - two.getX(), 2) + Math.pow(one.getY() - two.getY(), 2));
    }

    public static boolean checkIfIsLine(Point one, Point two, Point three) {
        return !((one.getX() == two.getX() && two.getX() == three.getX()) &&
                (one.getY() == two.getY() && two.getY() == three.getY()));
    }
}
