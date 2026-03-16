package Inheritance;

 public class Animal {

    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }


    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.sound();

        Cat c1 = new Cat();
        c1.sound();

    }
}