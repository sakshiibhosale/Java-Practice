//Class with Method

package ClassObjectConstructor;

public class Car {

    String brand;
    String price;

 void display(){
    System.out.println("Car Brand: " +brand);
    System.out.println("Car Price: " +price);
 }

 public static void main(String[] args) {
    Car c1 = new Car();
    
    c1.brand = "Creta";
    c1.price = "11 lakh";

    c1.display();
 }
    
}
