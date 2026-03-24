package Encapsulation;

public class CarDemo  {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        if (speed >= 0)
            this.speed = speed;
        else
            System.out.println("Invalid Speed");
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        CarDemo c = new CarDemo();
        c.setBrand("Toyota");
        c.setSpeed(120);

        System.out.println("Brand: " + c.getBrand());
        System.out.println("Speed: " + c.getSpeed());
    }
}