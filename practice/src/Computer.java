public class Computer {
    private int price;
    private String mode;
    private int size;

    public Computer(){

    }

    public Computer(int price, String mode, int length) {
        this.price = price;
        this.mode = mode;
        this.size = length;
    }

    public int getPrice() {
        return price;
    }

    public String getMode() {
        return mode;
    }

    public int getLength() {
        return size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setLength(int length) {
        this.size = length;
    }
}
