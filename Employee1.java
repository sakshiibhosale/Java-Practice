//Using Default Constructor

package ClassObjectConstructor;

public class Employee1 {
    int empID;
    String empName;
    int salary;

    void display(){
        System.out.println("Employee EmpID:" +empID);
        System.out.println("Employee Name: " +empName);
        System.out.println("Employee Salary: " +salary);
    }

    Employee1(){   //default Constructor
         empID = 102;
         empName = "Sanika";
         salary = 20000;
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.display();
    }
    
}
