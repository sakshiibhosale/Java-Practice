package Encapsulation;

public class Employee {

    private  int empId;
    private String empName;
    private  int empSalary;

    public void setEmpId(int empId){
        this.empId=empId;
    }   
    
    public int getEmpID(){
       return empId;   
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpSalary(int empSalary){
        this.empSalary = empSalary;
    }

    public int getEmpSalary(){
        return empSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("Shivaji");
        emp.setEmpSalary(400000);

        System.out.println(emp.getEmpID());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpSalary());
    }
}
