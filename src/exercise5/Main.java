package exercise5;

import exercise1.View;

public class Main {
    public static void main(String[] args) {
        int day = 25;
        int month = 2;
        int year = 2019;
        MyCalendar myCalendar = new MyCalendar();

        View.print("The next day is " + myCalendar.determineNextDay(day, month, year) +
                "/" + myCalendar.determineNextMonth(day, month, year) + "/" +
                        myCalendar.determineNextYear(day, month, year));
    }
}
