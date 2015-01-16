package Game.figures.humanLike;

import Game.figures.Being;
import Game.figures.Fighter;

/**
 * @author hauensma
 * Information about the Player
 */
public class Player extends Fighter {
    public boolean hasPet = false;
    public String petName = "";

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public int fight() {
        return 0;
    }

    @Override
    public int experience() {
        return 0;
    }

    @Override
    public int strength() {
        return 0;
    }

    @Override
    public int health() {
        return 0;
    }
}
