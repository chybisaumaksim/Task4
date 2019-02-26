package exercise1;

public class Main {

    public static void main(String[] args) {

        DragonHead dragonHead = new DragonHead(302);
        View.print(dragonHead.toString(DragonHead.calculateHeadsAndEyes()));
    }
}
