package UserInput;

import java.util.Scanner;

public class WelCome 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Your Name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Welcome " + name + " to KG coding");
    }
}
