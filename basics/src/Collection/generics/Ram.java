package Collection.generics;

public enum Ram {
    // ENUMS CANT START WITH NUMBERS
    GB_2(2),
    GB_4(4),
    GB_8(8),
    GB_16(16),
    GB_32(32),
    GB_64(64);

    private final int size;

    Ram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
