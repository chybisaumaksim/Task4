package exercise5;

public class MyCalendar {

    public int determineNextDay(int day, int month, int year) {
        if ((checkUltimateDay28(day, month, year) && determineLeapYear(year)) ||
                checkUltimateDay30(day, month) || checkUltimateDay31(day, month) ||
                  (checkUltimateDay29(day, month, year) && !determineLeapYear(year)) ||
                    (checkUltimateDay28(day, month, year) && !determineLeapYear(year))) {
            day = 1;
        } else if (checkUltimateDay28(day, month, year) && !determineLeapYear(year)) {
            day = 29;
        } else {
            day++;
        }
        return day;
    }

    public int determineNextMonth(int day, int month, int year) {
        if (checkUltimateDay31(day, month) || checkUltimateDay30(day, month) ||
                (checkUltimateDay29(day, month, year)) && !determineLeapYear(year) ||
                (checkUltimateDay28(day, month, year) && !determineLeapYear(year))) {
            return ++month;
        } else if (month == 12) {
            month = 0;
        }
        return month;
    }

    public int determineNextYear(int day, int month, int year) {
        if (day == 31 && month == 12) {
            year++;
        }
        return year;
    }

    public boolean determineLeapYear(int year) {

        return checkCondOne(year) && checkCondTwo(year) && checkCondThree(year);
    }

    public boolean checkCondOne(int year) {
        return year % 4 == 0;
    }

    public boolean checkCondTwo(int year) {
        return !(year % 4 == 0 && year % 100 == 0);
    }

    public boolean checkCondThree(int year) {
        return (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
    }

    public boolean checkUltimateDay30(int day, int month) {
        return day == 30 && (month == 4 || month == 6 || month == 9 || month == 11);
    }

    public boolean checkUltimateDay31(int day, int month) {
        return day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
    }

    public boolean checkUltimateDay29(int day, int month, int year) {
        return day == 29 && month == 2 && !determineLeapYear(year);
    }

    public boolean checkUltimateDay28(int day, int month, int year) {
        return day == 28 && month == 2;
    }
}