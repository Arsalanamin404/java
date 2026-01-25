package Collection;

import java.util.HashMap;
import java.util.Scanner;

class Passport {
    final private String full_name;
    final private String state;
    final private String country;

    Passport(String full_name, String state, String country) {
        this.full_name = full_name;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "full_name='" + full_name + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

public class MainApp_HashMap {
    public static void main(String[] args) {
/*
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2, "sql");
        hm.put(3, "Spring Boot");
        hm.put(4, "Hibernate");
        hm.put(5, "Microservices");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("KEY: "+entry.getKey() + ", VALUE: " + entry.getValue());
        }
*/

        HashMap<Integer, Passport> map = getPassportHashMap();

        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly enter you passport number: ");
        int user_passport_id = sc.nextInt();

        // O(1) -> Time complexity
        Passport passport = map.get(user_passport_id);

        if (passport != null) {
            System.out.println("Passport Found");
            System.out.println(passport);
        } else {
            System.out.println("404::Invalid passport number");
        }
    }

    private static HashMap<Integer, Passport> getPassportHashMap() {
        Passport p1 = new Passport("Admin","Srinagar","KMR");
        Passport p2 = new Passport("Raju", "Bihar", "IN");
        Passport p3 = new Passport("Iyer", "Kerala", "IN");
        Passport p4 = new Passport("Jaithalal", "Gujarat", "IN");
        Passport p5 = new Passport("Babita G", "Kolkata", "IN");
        Passport p6 = new Passport("Bindi Master", "Maharashtra", "IN");


        HashMap<Integer, Passport> map = new HashMap<>();
        map.put(321, p1);
        map.put(133, p2);
        map.put(431, p3);
        map.put(902, p4);
        map.put(490, p5);
        map.put(742, p6);

        return map;
    }
}
