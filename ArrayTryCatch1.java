package ExceptionHandling;

public class ArrayTryCatch1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            System.out.println(arr[10]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range!");
            System.out.println(e);
        }
    }
}