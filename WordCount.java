package String_Practice;

public class WordCount {
    public static void main(String[] args) {
        
        String str = "Java is a powerful programming language";

        //remove extra spaces and split by space
        String [] words = str.trim().split("\\s+");

        int count = words.length;

        System.out.println("Number of words: " +count);
    }
    
}
