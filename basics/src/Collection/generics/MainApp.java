package Collection.generics;


import java.util.Collections;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Laptop> laptopInventory = new Inventory<>();

        System.out.println("-".repeat(50));

        bookInventory.addItem(new Book("Learn Java With Me", "Mr. Mohammad Arsalan Rather"));
        bookInventory.addItem(new Book("Spring Boot in Action", "ADMIN"));
        bookInventory.addItem(new Book("Let us C", "Yashavant Kanetkar"));

        for (Book book : bookInventory.getItem())
            System.out.println(book);

        System.out.println("-".repeat(50));

        bookInventory.getItem().sort(Comparator.comparing(Book::getTitle));

        for (Book book : bookInventory.getItem())
            System.out.println(book);

        System.out.println("-".repeat(50));

        laptopInventory.addItem(new Laptop("Apple", Ram.GB_8, Processor.M1));
        laptopInventory.addItem(new Laptop("Dell", Ram.GB_16, Processor.I5));
        laptopInventory.addItem(new Laptop("HP", Ram.GB_16, Processor.I7));
        laptopInventory.addItem(new Laptop("ASUS", Ram.GB_32, Processor.I9));
        laptopInventory.addItem(new Laptop("Apple", Ram.GB_16, Processor.I5));
        laptopInventory.addItem(new Laptop("Acer", Ram.GB_4, Processor.I5));

        for (Laptop laptop : laptopInventory.getItem())
            System.out.println(laptop);

        System.out.println("-".repeat(50));

//        sort according to ram
//        Collections.sort(laptopInventory.getItem());

//        sort according to brand name - ALPHABETICALLY
//        laptopInventory.getItem().sort(Comparator.comparing(Laptop::getBrand));

//        sort according to processor in DESC order
        laptopInventory.getItem().sort(Comparator.comparing(Laptop::getProcessor).reversed());

        for (Laptop laptop : laptopInventory.getItem())
            System.out.println(laptop);

        System.out.println("-".repeat(50));

    }
}
