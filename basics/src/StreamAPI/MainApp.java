package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Arsalan Rather", "arsalanrather.dev@gmail.com", true, 23, Role.ADMIN));
        users.add(new User("Neha Sharma", "neha.sharma@gmail.com", true, 26, Role.MANAGER));
        users.add(new User("John Doe", "john.doe@gmail.com", false, 32, Role.USER));
        users.add(new User("Taarak Mehta", "tarak.mehta@gokuldham.com", true, 42, Role.WRITER));
        users.add(new User("Anjali Mehta", "anjali.mehta@gokuldham.com", false, 38, Role.DIETITIAN));
        users.add(new User("Jethalal Gada", "jethalal@gadaelectronics.com", true, 45, Role.BUSINESS_OWNER));
        users.add(new User("Daya Gada", "daya@gadaelectronics.com", true, 40, Role.HOMEMAKER));
        users.add(new User("Champaklal Gada", "champaklal@gokuldham.com", true, 70, Role.RETIRED));
        users.add(new User("Tapu Gada", "tapu@gokuldham.com", true, 18, Role.STUDENT));
        users.add(new User("Atmaram Tukaram Bhide", "bhide@gokuldham.com", true, 48, Role.TEACHER));
        users.add(new User("Madhavi Bhide", "madhavi@gokuldham.com", true, 44, Role.SMALL_BUSINESS));
        users.add(new User("Dr. Hansraj Hathi", "hathi@gokuldham.com", false, 50, Role.DOCTOR));
        users.add(new User("Komal Hathi", "komal@gokuldham.com", true, 46, Role.HOMEMAKER));
        users.add(new User("Popatlal Pandey", "popatlal@toofanexpress.com", true, 39, Role.JOURNALIST));
        users.add(new User("Abdul", "abdul@gokuldham.com", false, 35, Role.STORE_MANAGER));

        System.out.println("-".repeat(40));
        System.out.println("DISTINCT SORTED ACTIVE USER EMAILS");
        System.out.println("-".repeat(40));

        List<String> activeUserEmails = users.stream()
                .filter(User::isActive)
                .map(User::getEmail)
                .distinct()
                .sorted()
                .toList();

        activeUserEmails.forEach(System.out::println);
    }
}

