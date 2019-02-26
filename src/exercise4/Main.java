package exercise4;

import exercise1.View;

public class Main {
    public static void main(String[] args) {

        View.print("The mood is " + MoodSensor.checkMood((int) (Math.random()*10-3)));
    }
}
