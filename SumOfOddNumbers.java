//Create a program to sum all odd numbers from 1 to a specified number N
package Function_Loops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 !=0) {   // checks odd number
                sum = sum + i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }
}
