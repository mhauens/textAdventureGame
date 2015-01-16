package Game.system;

import Game.info.Player;

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
        player.setUsername(username);
        String petName = player.getPetName();
        boolean hasPet = player.isHasPet();
        File file = new File(username+".csv");
        if(file.exists()) {
            println("Der Charakter existiert bereits! Bitte wähle einen anderen Namen");
            createGame(player);
        } else {
            println("Dein Charakter wurde angelegt. Das Spiel wird erstellt...");
            PrintWriter pw = new PrintWriter(file);
            pw.write(username+";");
            pw.write(petName+";");
            pw.write(String.valueOf(hasPet)+";");
            pw.close();
            println("Das Spiel wurde erstellt.");
        }
    }

    public static void saveGame(Player player) {

    }

    public static void loadGame(Player player) {

    }

    public static void move() {
        println("----------------------");
        println("Wohin willst du gehen?");
        println("1: Norden");
        println("2: Osten");
        println("3: Süden");
        println("4: Westen");

    }

    public static void fight() {

    }
}
