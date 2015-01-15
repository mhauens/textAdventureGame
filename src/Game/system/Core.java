package Game.system;

import Game.info.Player;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author hauensma
 * Creates, Saves and Loads a game
 */
public class Core {

    public static void createGame(Player player) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deinem Charakter einen Namen: ");
        String username = scanner.next();
        player.setUsername(username);
        String petName = player.getPetName();
        boolean hasPet = player.isHasPet();
        File file = new File(username+".csv");
        if(file.exists()) {
            System.out.println("Der Charakter existiert bereits! Bitte wähle einen anderen Namen");
            createGame(player);
        } else {
            System.out.println("Dein Charakter wurde angelegt. Das Spiel wird erstellt...");
            PrintWriter pw = new PrintWriter(file);
            pw.write(username+";");
            pw.write(petName+";");
            pw.write(hasPet+";");
            pw.close();
        }
    }

    public static void saveGame(Player player) {

    }

    public static void loadGame(Player player) {

    }
}
