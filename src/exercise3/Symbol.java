package exercise3;

public class Symbol {

    public boolean definitionVowel(String symbol) {
        return symbol.matches("^(?i:[aeiouy]).*") ||
                symbol.matches("^(?ui:[аеёиоуыэюя]).*");
    }
}
