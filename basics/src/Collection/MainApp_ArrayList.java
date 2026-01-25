package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> roles = new ArrayList<>();

        roles.add("ADMIN");
        roles.add("MEMBER");
        roles.add("EDITOR");
        roles.add("USER");
        roles.add("SUPERADMIN");

        System.out.println(roles);

        // accessing elements of collection
        String data = roles.get(1);
        System.out.println(data);

        Iterator<String> itr = roles.iterator();

        while (itr.hasNext()) {
            String role = itr.next();

            if ("EDITOR".equals(role))
                itr.remove();
            else
                System.out.print(role + " ");
        }
    }
}
