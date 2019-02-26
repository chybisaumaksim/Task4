package exercise4;

public class MoodSensor {

    public static String checkMood(int number) {
        String mood = " ☻ Drunk";
        switch (number) {
            case 0:
                mood = "☹ Sad";
                break;
            case 1:
                mood = "✈ Busy";
                break;
            case 2:
                mood = "☺ Happy";
                break;
            case 3:
                mood = "㋡ Cheerful";
                break;
            case 4:
                mood = "✿ Romantic";
                break;
            case 5:
                mood = "☢ Dangerous";
                break;
            case 6:
                mood = "❤ Enamored";
                break;
            case 7:
                mood = "☠ Killed";
                break;
        }
        return mood;
    }
}
