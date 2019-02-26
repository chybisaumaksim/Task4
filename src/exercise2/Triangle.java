package exercise2;

public class Triangle {

    double distAB;
    double distBC;
    double distAC;

    public static boolean checkIfIsTriangle(Point a, Point b, Point c) {

        double distAB = Point.calculateDistanceBetweenPoints(a, b);
        double distBC = Point.calculateDistanceBetweenPoints(b, c);
        double distAC = Point.calculateDistanceBetweenPoints(a, c);
        return (distAB < distAC + distBC && distAC < distAB + distBC
                && distBC < distAB + distAC) && Point.checkIfIsLine(a, b, c);
    }

    public boolean checkIfIsRectangularTriangle(Point a, Point b, Point c) {
        if (Triangle.checkIfIsTriangle(a, b, c)) {
            return (Math.pow(distAB, 2) == Math.pow(distAC, 2) + Math.pow(distBC, 2)) ||
                    Math.pow(distAC, 2) == Math.pow(distAB, 2) + Math.pow(distBC, 2) ||
                    Math.pow(distBC, 2) == Math.pow(distAB, 2) + Math.pow(distAC, 2);
        } else {
            return false;
        }
    }
}
