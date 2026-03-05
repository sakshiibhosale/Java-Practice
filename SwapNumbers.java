package Operators;

import java.util.Scanner;

public class SwapNumbers
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Please Enter value of a: ");
        int a = sc.nextInt();

        System.out.println("Please Enter value of b: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("value of a is: " +a);
        System.out.println("Value of b :" +b);
        

    }
}
