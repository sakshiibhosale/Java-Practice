//Divide Two Numbers with Exception Handling

package ExceptionHandling;

public class ArithmaticException {
    public static void main(String[] args) {
        try{
        int a = 10;
        int b = 0;
        int c = a/b;   
        System.out.println("print result : " +c);
    }
     catch (ArithmeticException e){
        System.out.println("Can't Divided By Zero");
           System.out.println(e);   // optional: shows error details
    }
}
    
}
