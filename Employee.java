package Inheritance;

 public class Employee {

    int empId ;
    String name ;

    void display() {
        System.out.println("Employee ID: " +empId);
        System.out.println("Employee Name: " +name);
    }
}

class Manager extends Employee {
    int salary;

    void display() {
    super.display();
    System.out.println("Manager Salary: " +salary);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager();

    m1.empId = 102;
    m1.name = "Sakshi";
    m1.salary = 50000;
    
        m1.display();
    }
    
}
