public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + ": Yay! JACKPOT");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Durch 3!");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Durch 5!");
            }
        }

        bruch drittel = new bruch(1, 123);

        drittel.ausgabe();
        drittel.kehrwert();
        drittel.ausgabe();
    }
}