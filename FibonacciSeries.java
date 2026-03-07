package Exercise_Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: ");

        for(int i = 1; i<=num; i++){
          System.out.print(first + " ");

          int next = first + second;
          first = second;
          second = next;
        }
    }
    
}
