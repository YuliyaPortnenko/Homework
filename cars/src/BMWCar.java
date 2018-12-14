public class BMWCar extends Car {
    private String wheel;

    public BMWCar(int price, int speed, String mode, int length, String wheel) {
        super(price, speed, mode, length);
        this.wheel = wheel;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String getMode() {
        return "BMW " + super.getMode();
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "wheel='" + wheel + '\'' +
                '}';
    }

    @Override
    public void sell() {
        System.out.println("BMW sold");
    }

    @Override
    public void buy() {
        System.out.println("BMW bought");

    }
}
