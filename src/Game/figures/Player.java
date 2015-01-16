package Game.figures;

/**
 * @author hauensma
 * Information about the Player
 */
public class Player extends Being {
    public boolean hasPet = false;
    public String petName = "";
    public int experience;

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    protected int fight() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
