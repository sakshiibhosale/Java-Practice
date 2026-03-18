package Encapsulation;

public class Student {
    private int id;
    private String name;
  

    public void setId (int id){
        this.id = id;
    }

    public int getid(){
        return id;
    }

    public void setName (String name){
        this.name = name;
    }

  public String getname(){
    return name;
  }

  public static void main(String[] args) {
    Student s1 = new Student();

    s1.setId (101);
    s1.setName  ("Sakshi");

    System.out.println(s1.getid());
    System.out.println(s1.getname());
  }
    
}
