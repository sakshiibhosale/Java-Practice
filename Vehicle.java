package Inheritance;

 public class Vehicle {
     void start() {
        System.out.println("Vecicle is Start");
     }
}

class Car extends Vehicle {
     void drive() {
        System.out.println("Car is Drive");
     }

    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.start();;
        c1.drive();
    }
    
}
