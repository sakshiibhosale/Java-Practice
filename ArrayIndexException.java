package ExceptionHandling;

public class ArrayIndexException {
    public static void main(String[] args) {
    int arr[] = {1,2,3};

    try {
        System.out.println(arr[5]);
} 
catch (ArrayIndexOutOfBoundsException e){
  System.out.println("Index is out of range..");
   System.out.println(e);   // optional: shows error details
   }
  }
}