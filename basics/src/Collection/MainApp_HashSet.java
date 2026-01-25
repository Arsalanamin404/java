package Collection;

import java.util.HashSet;

public class MainApp_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(32);
        hs.add(12);
        hs.add(89);
        hs.add(9);

        System.out.println(hs);
    }
}
