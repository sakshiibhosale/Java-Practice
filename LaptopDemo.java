package Encapsulation;

 public class LaptopDemo {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid Price");
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
       LaptopDemo l = new LaptopDemo();
        l.setModel("Dell Inspiron");
        l.setPrice(55000);

        System.out.println("Model: " + l.getModel());
        System.out.println("Price: " + l.getPrice());
    }
}