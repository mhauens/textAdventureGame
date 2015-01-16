package Game.figures.categories;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author Martin
 */
public abstract class Carrier extends Fighter{
    public String[] items;

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
