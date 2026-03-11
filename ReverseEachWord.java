package String_Practice;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter a String: "));
        String str = sc.nextLine();

        String [] words = str.split(" ");

        for(String word : words){
            StringBuilder sb = new StringBuilder(word);
            System.out.println(sb.reverse() + " ");
        }
        sc.close();
    }
}
