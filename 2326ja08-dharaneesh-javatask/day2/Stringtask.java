import java.util.Scanner;

public class Stringtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        int wordCount = words.length;
        int charCount = input.replace(" ", "").length();
        String reversed = new StringBuilder(input).reverse().toString();

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count (excluding spaces): " + charCount);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Longest Word: " + longest);
    }
}