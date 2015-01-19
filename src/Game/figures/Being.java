package Game.figures;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author hauensma
 */
public abstract class Being {
    public String name;
    public int[][] position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
}
