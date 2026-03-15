//Basic Question – Class and Object

package ClassObjectConstructor;

public class Student {
    
    int id ;
    String name;
    int marks;


 void display(){
    System.out.println("Student ID: "  +id);
    System.out.println("Student Name: " +name);
    System.out.println("Srudent Marks: " +marks);

 }   

 public static void main(String[] args) {
    Student s1 = new Student();

    s1.id = 101;
    s1.name = "Sakshi";
    s1.marks = 90;

    s1.display();
 }
}

