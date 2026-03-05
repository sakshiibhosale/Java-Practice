package UserInput;

import java.util.Scanner;

public class UserInput2 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your age:");    //Integer Input (nextInt())
     int age = sc.nextInt();

     System.out.println("Enter your percentage:");  //Float Input (nextFloat())
     float percentage = sc.nextFloat();

     System.out.println("Enter your salary:");  //Double Input (nextDouble())
     double salary = sc.nextDouble();

     
     System.out.println("Enter your FirstName:");  //One Word String (next())
     String FirstName = sc.next();

     System.out.println("FirstName:" +FirstName);

     sc.nextLine();  //Full Line String (nextLine())

     System.out.println("Enter your full name:");   //Full Line String (nextLine())
     String FullName = sc.nextLine();

     System.out.println("FullName: " + FullName);

     System.out.println("Are you a student? (true/false): ");  //Boolean Input(nextBoolean())
     boolean isStudent = sc.nextBoolean();

   }
}
