package Game.system;

import Game.figures.humanLike.Player;
import Game.map.Map;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Game.utils.Constants.println;

/** *
 * @author hauensma
 * Creates, Saves and Loads a game
 */
public class Core {
    public static void createGame(Player player) throws IOException {
        Scanner scanner = new Scanner(System.in);
        println("Bitte gib deinem Charakter einen Namen: ");
        String username = scanner.next();
        player.setName(username);
        player.setPosition(new int[0][0]);
        String petName = player.getPetName();
        boolean hasPet = player.isHasPet();
        File file = new File(username+".csv");
        if(file.exists()) {
            println("Der Charakter existiert bereits! Bitte wähle einen anderen Namen");
            createGame(player);
        } else {
            println("Dein Charakter wurde angelegt. Das Spiel wird erstellt...");
            PrintWriter pw = new PrintWriter(file);
            pw.print(username + ";");
            pw.print(petName + ";");
            pw.print(String.valueOf(hasPet) + ";");
            pw.print(player.getPosition());
            pw.close();
            println("Das Spiel wurde erstellt.");
        }
    }

    public static void saveGame(Player player) {

    }

    public static void loadGame(Player player) {

    }

    public static void playGame(Player player) {
        Map map;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            println("Was willst du machen.");
            println("1: bewegen");

            int options = scanner.nextInt();
            try {
                switch(options) {
                    case 1:
                        move(player);
                        break;
                }
            } catch (Exception e) {
                println("Fehler in der Core class: " + e.getLocalizedMessage());
            }



        }
    }

    public static void move(Player player) {
        Scanner scanner = new Scanner(System.in);

        println("----------------------");
        println("Wohin willst du gehen?");
        println("1: Norden");
        println("2: Osten");
        println("3: Süden");
        println("4: Westen");

        int options = scanner.nextInt();

        try {
            switch(options) {
                case 1:
                    int i;
                    for (i = 0; i < player.getPosition().length; i++) {
                        int j;
                        for (j = 0; j < player.getPosition()[i].length; j++) {
                            //player.setPosition(player.getPosition()[i+1][j]);
                            break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } catch (Exception e) {
            println("Fehler in der Core class: " + e.getLocalizedMessage());
        }
    }
}
