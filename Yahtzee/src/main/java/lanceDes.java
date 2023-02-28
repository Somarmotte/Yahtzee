import java.util.*;

public class lanceDes {
    public int min = 1;
    public int max = 6;

    public int generateRandom() {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

}