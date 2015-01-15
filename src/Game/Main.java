package Game;

import Game.system.Core;
import Game.info.Player;

import java.util.Scanner;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author hauensma
 * This is the Main class it'll
 * ask the user what he would wants to do
 * 1) create a game 2) load a game
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("------------------------------------------");
        System.out.println("- Opionen      | Information\n");
        System.out.println("- 1: Neu       | Neues Spiel erstellen.");
        System.out.println("- 2: Laden     | vorhandenes Spiel laden.");
        System.out.println("- 3: Beenden   | Spiel beenden.");

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
            System.out.println("Fehler in der Main class: " + e.getLocalizedMessage());
        }
    }
}
