import java.util.Scanner;

public class IsPalindromeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();
        
        if (word.equals(sb.toString())) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
        System.out.println("The reverse of the word is: " + sb.toString());

        scanner.close();
    }
}
