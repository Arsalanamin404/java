package Collection;

import java.util.LinkedList;

public class MainApp_LinkedList {
    public static void main(String[] args) {
        //internally it follows DLL
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(50);
        ll1.add(60);
        ll1.addFirst(900);
        System.out.println(ll1);
        System.out.println(ll1.contains(10));

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(21);
        ll2.add(20);
        ll2.add(92);
        ll2.add(10);
        ll2.addAll(ll1);
        System.out.println(ll2);
        System.out.println(ll2.containsAll(ll1));

    }

}

