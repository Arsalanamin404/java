package Collection.generics;


class Laptop implements Comparable<Laptop> {
    private final String brand;
    private final Ram RAM;
    private final Processor processor;


    Laptop(String brand, Ram RAM, Processor processor) {
        this.brand = brand;
        this.RAM = RAM;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }


    public Processor getProcessor() {
        return processor;
    }

    public int getRam() {
        return RAM.getSize();
    }

    //    by implementing comparable interface, only one sorting rule is possible
    public int compareTo(Laptop other) {
        return Integer.compare(this.getRam(), other.getRam());
    }

    @Override
    public String toString() {
        return "brand: " + brand + ", RAM: " + RAM.getSize() +
                "GB, processor: " + processor;
    }
}
