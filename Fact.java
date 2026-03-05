package Exercise_Practice;

public class Fact {
    public static void main(String[] args) {
        int num = 5;
        int Fact = 1;

        for(int i = 1; i<=num; i++){
            Fact = Fact * i;
        }
        System.out.println("Factorial of Number is:" +Fact);
    }
    
}
