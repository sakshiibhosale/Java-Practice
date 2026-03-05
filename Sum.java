package UserInput;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter First Number: ");
        int FirstNumber = sc.nextInt();

        System.out.print("Please Enter Second Number: ");
        int SecondNumber = sc.nextInt();

        int sum = FirstNumber + SecondNumber;

        System.out.println("Sum of your Numbers is : " + sum);

  
    }
}
