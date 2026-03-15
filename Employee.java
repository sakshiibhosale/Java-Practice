//Using Parameterized Constructor
package ClassObjectConstructor;

public class Employee {

    int id;
    String name;
    double salary;


    void display(){
        System.out.println("Employee ID: " +id);
        System.out.println("Employee Name: " +name);
        System.out.println("Employee Salary: " +salary);
    }

    Employee(int id, String name, double salary){ //Parameterized Constructor
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Shivaji", 50000.00);
        e1.display();
    }
}
