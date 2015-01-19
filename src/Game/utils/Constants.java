package Game.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO: Write JavaDoc - responsibility, purpose, collaborators.
 *
 * @author hauensma
 */
public class Constants {
    public static void println(String message) {
        System.out.println(message);
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        return currentDate;
    }

    public static int dice(int amount) {
        int outcome = (int) (Math.random()*amount+1);
        return outcome;
    }


}
