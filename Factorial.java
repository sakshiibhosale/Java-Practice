//Write a fuction that calculates the factorial of a given number

package Function_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " +num+ "is: " +result);
        
    }

    public static int factorial(int num) {
        int fact = 1;

        for(int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;

        
    }
    
}
