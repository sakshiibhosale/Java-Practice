package UserInput;

import java.util.Scanner;

public class UserInput3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Full Name:");
        String FullName = sc.nextLine();

        System.out.println("FullName:" +FullName);

        System.out.println("Enter Your Mobile Number:");  //nextLong() is used to read a long value.
        long MobileNumber = sc.nextLong();

        System.out.println("MobileNumber:" + MobileNumber);
    }
}
