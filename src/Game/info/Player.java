package Game.info;

import java.util.List;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author hauensma
 */
public class Player {
    public String username;
    public String[] items;
    public boolean hasPet = false;
    public String petName = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

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
}
