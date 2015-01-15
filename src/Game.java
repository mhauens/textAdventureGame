import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Was m�chtest du machen?\n\nOptionen:\n1: Bewegen\n2: Beenden\n");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    run();
                    break;
                case 2:
                    exit();
                    break;
            }
        }
    }

    public static void run() {
        System.out.println("Wohin m�chtest du gehen?\n\nOptionen:\n1: Norden\n2: Osten\n3: S�den\n4: Westen\n");
        int movement = scanner.nextInt();

        switch (movement) {
            case 1:
                System.out.println("Du bist nach Norden gegangen.\n\n");
                break;
            case 2:
                System.out.println("Du bist nach Osten gegangen.\n\n");
                break;
            case 3:
                System.out.println("Du bist nach S�den gegangen.\n\n");
                break;
            case 4:
                System.out.println("Du bist nach Westen gegangen.\n\n");
                break;
        }
    }

    public static int dice(int amount) {
        int outcome = (int) (Math.random()*amount+1);
        return outcome;
    }


    static void exit() {
        System.out.println("Und Tsch�ss...");
        System.exit(0);
    }
}