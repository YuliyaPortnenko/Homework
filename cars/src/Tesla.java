public  class Tesla extends Car {
    private int capacity;

    public Tesla(int price, int speed, String mode, int length, int capacity) {
        super(price, speed, mode, length);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public String getMode() {
        return "Tesla "+ super.getMode();
    }

    @Override
    public void sell() {
        System.out.println("Tesla sold");
    }

    @Override
    public void buy() {
        System.out.println("Tesla bought");

    }
}
