package exercise2;

import exercise1.View;

public class Main {

    public static void main(String[] args) {

        View.print("This program check whether the points are vertices of a triangle");
        Point a = new Point(0, 3);
        Point b = new Point(4, 0);
        Point c = new Point(4, 4);
        Triangle triangle = new Triangle();

        View.print("This points are vertices of a triangle is " +
                triangle.checkIfIsTriangle(a, b, c));
        View.print("This points are vertices of a rectangular triangle is " +
                triangle.checkIfIsRectangularTriangle(a, b, c));
    }

}
