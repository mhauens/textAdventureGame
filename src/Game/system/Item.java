package Game.system;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author Martin
 */
public class Item {
    private int id;
    private String name;
    private int status;
    private boolean isWeapon;
    private int strength;

    public Item(int id, String name, int status, boolean isWeapon, int strength)  {
        this.id = id;
        this.name = name;
        this.status =status;
        this.isWeapon = isWeapon;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isWeapon() {
        return isWeapon;
    }

    public void setWeapon(boolean isWeapon) {
        this.isWeapon = isWeapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
