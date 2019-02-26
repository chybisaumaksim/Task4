package exercise1;

class DragonHead {
    final static int FIRST_PERIOD = 200;
    final static int SECOND_PERIOD = 300;
    final static int FIRST_PERIOD_COEFFICIENT = 3;
    final static int SECOND_PERIOD_COEFFICIENT = 2;
    final static int REST_PERIOD_COEFFICIENT = 1;
    private static int age;

    public DragonHead(int age) {
        this.age = age;
    }

    static int calculateHeadsAndEyes() {
        int heads = FIRST_PERIOD_COEFFICIENT;
        if (age <= FIRST_PERIOD) {
            heads += age * FIRST_PERIOD_COEFFICIENT;
        } else if (age <= SECOND_PERIOD) {
            heads += FIRST_PERIOD * FIRST_PERIOD_COEFFICIENT + (age - FIRST_PERIOD) * SECOND_PERIOD_COEFFICIENT;
        } else {
            heads += FIRST_PERIOD * FIRST_PERIOD_COEFFICIENT + (age - FIRST_PERIOD) * SECOND_PERIOD_COEFFICIENT + (age - SECOND_PERIOD) * REST_PERIOD_COEFFICIENT;
        }
        return heads;
    }

    String toString(int heads) {
        return "The number of dragon heads is " + heads + " and the number of eyes is " + heads * 2;
    }
}
