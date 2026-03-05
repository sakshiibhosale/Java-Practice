//Develop a program that prints the multiplication table for a given Number

package Function_Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Multiplication World\n");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {

         for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
