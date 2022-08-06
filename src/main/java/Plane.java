public enum Plane {
    BOEING747(524, 183500),
    AIRBUSA320(180, 77000);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
