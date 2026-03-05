package Operators;

public class Unary 
{
    public static void main(String[] args)
     {
         int x = 5;
         int y = -x;  //(Using (-) operator)
         int z = -y;
       
         System.out.println(y);
         System.out.println(z);

        int a = 5;
        
        a++;   // Using Post Increment
        System.out.println(a);

        ++a;  //Using Pre Increment
        System.out.println(a);

        int b = 10;

        b--;   //Using Post Decrement
        System.out.println(b);

        --b;   //Using Pre Decrement
        System.out.println(b);

    }
}
