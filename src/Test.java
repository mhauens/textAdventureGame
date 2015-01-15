import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean foundCreature = false;
    public static boolean foundItem = false;

    public static void main(String[] args) {
        while(true) {
            System.out.println("Was m�chtest du machen?");
            if(foundCreature) {
                System.out.println("\n\nOptionen:\n1: k�mpfen\n2: fl�chten\n");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        fight();
                        foundCreature = false;
                        break;
                    case 2:
                        System.out.println("Du bist gefl�chtet");
                        foundCreature = false;
                        break;
                }
            } else if(foundItem){
                System.out.println("\n\nOptionen:\n1: aufheben\n2: liegen lassen\n");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        //TODO: takeItem();
                        System.out.println("Du hast das Item aufgehoben");
                        foundItem = false;
                        break;
                    case 2:
                        foundItem = false;
                        break;
                }
            } else {
                System.out.println("\n\nOptionen:\n1: Bewegen\n2: Beenden\n");
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
    }

    public static void run() {
        System.out.println("Wohin m�chtest du gehen?\n\nOptionen:\n1: Norden\n2: Osten\n3: S�den\n4: Westen\n");
        int movement = scanner.nextInt();

        switch (movement) {
            case 1:
                System.out.println("Du bist nach Norden gegangen.\n\n");
                action();
                break;
            case 2:
                System.out.println("Du bist nach Osten gegangen.\n\n");
                action();
                break;
            case 3:
                System.out.println("Du bist nach S�den gegangen.\n\n");
                action();
                break;
            case 4:
                System.out.println("Du bist nach Westen gegangen.\n\n");
                action();
                break;
        }
    }

    public static int dice(int amount) {
        int outcome = (int) (Math.random()*amount+1);
        return outcome;
    }

    public static void action() {
        switch (dice(5)) {
            case 1:
                System.out.println("Du hast ein Item gefunden:");
                item();
                break;
            case 2:
                System.out.println("Du triffst auf einen Gegner:");
                creature();
                break;
            default:
                break;
        }
    }

    public static void creature() {
        foundCreature = true;
        switch (dice(4)) {
            case 1:
                System.out.println("Ork");
                break;
            case 2:
                System.out.println("Troll");
                break;
            case 3:
                System.out.println("Drache");
                break;
            case 4:
                System.out.println("Goul");
                break;
        }
    }

    public static void item() {
        foundItem = true;
        switch (dice(3)) {
            case 1:
                System.out.println("Schwert\n\n");
                break;
            case 2:
                System.out.println("Axt\n\n");
                break;
            case 3:
                System.out.println("Bogen\n\n");
                break;
        }
    }

    public static void fight() {
        int creature = dice(6);
        int character = dice(6);

        if(character >= creature) {
            System.out.println("Du hast gewonnen.");
        } else {
            System.out.println("Du hast verloren.");
        }
    }


    static void exit() {
        System.out.println("Und Tsch�ss...");
        System.exit(0);
    }
}