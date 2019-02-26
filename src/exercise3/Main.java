package exercise3;

import exercise1.View;

public class Main {
    public static void main(String[] args) {

        Symbol symbol = new Symbol();
        symbol.definitionVowel("s");
        View.print("Symbol is vowel " + symbol.definitionVowel("S"));

    }
}

