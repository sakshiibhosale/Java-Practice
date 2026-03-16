package Inheritance;

 public class Animals {

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals{

    void bark(){
        System.out.println("Dog is barking");
    }

    public static  void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}