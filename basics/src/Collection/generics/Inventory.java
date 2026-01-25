package Collection.generics;


import java.util.ArrayList;
import java.util.List;

class Inventory<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItem() {
        return items;
    }
}

