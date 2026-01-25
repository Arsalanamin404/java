package Collection;

import java.util.ArrayDeque;

public class MainApp_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ages = new ArrayDeque<>();
        ages.add(90);
        ages.add(53);
        ages.add(22);
        ages.add(18);
        ages.add(12);
        System.out.println(ages);
    }
}
