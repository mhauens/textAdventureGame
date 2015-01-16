package Game.system;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin
 */
public class ItemManager {
    private static Map<Integer,Item> items = new HashMap<Integer, Item>();

    public Item getItemList(int id) {
        return items.get(id);
    }
}
