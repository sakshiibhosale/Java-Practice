package Inheritance;

  public class Student {

    int id  ;
    String name ;

    void display(){
        System.out.println("Student ID: " +id);
        System.out.println("Student Name: " +name);
    }
}

class Marks extends Student {
    
     int marks ;

     void display(){
        super.display();  //calling parent class method
        System.out.println("Student Marks: " +marks);
     }

    public static void main(String[] args) {

    Marks m1 = new Marks();
    m1.id = 101;
    m1.name = "Shivaji";
    m1.marks = 90;

    m1.display();
    
    }
}
