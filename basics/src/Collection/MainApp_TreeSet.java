package Collection;

import java.util.TreeSet;

public class MainApp_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(21);
        ts.add(11);
        ts.add(92);
        ts.add(83);
        ts.add(1);

        System.out.println(ts);
        System.out.println("\nHIGHER: "+ts.higher(83));
        System.out.println("CEILING: "+ts.ceiling(83));

        System.out.println("\nLOWER: "+ts.lower(11));
        System.out.println("FLOOR: "+ts.floor(11));

        System.out.println("\nTAIL SET: "+ts.tailSet(20));
        System.out.println("HEAD SET: "+ts.headSet(20));
    }
}
