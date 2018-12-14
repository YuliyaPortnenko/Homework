public abstract class Car implements  Shop{
    private int price;
    private int speed;
    private String mode;
    private int length;

    public Car() {
    }

    public Car(int price, int speed, String mode, int length) {
        this.price = price;
        this.speed = speed;
        this.mode = mode;
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMode() {
        return mode;
    }

    public int getLength() {
        return length;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", mode='" + mode + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public void sell() {
        System.out.println(getMode()+"sold");
    }

    @Override
    public void buy() {
        System.out.println(getMode()+"bought");
    }
}
