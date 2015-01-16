package Game;

import Game.system.Core;
import Game.info.Player;

import java.util.Scanner;

import static Game.utils.Constants.println;

/**
 * @author hauensma
 * This is the Main class it'll
 * ask the user what he would wants to do
 * 1: create a game 2: load a game 3: exit
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        println("------------------------------------------");
        println("- Opionen      | Information\n");
        println("- 1: Neu       | Neues Spiel erstellen.");
        println("- 2: Laden     | vorhandenes Spiel laden.");
        println("- 3: Beenden   | Spiel beenden.");

        int options = scanner.nextInt();
        try {
            switch(options) {
                case 1:
                    Core.createGame(player);
                    break;
                case 2:
                    Core.loadGame(player);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            println("Fehler in der Main class: " + e.getLocalizedMessage());
        }
    }
}
