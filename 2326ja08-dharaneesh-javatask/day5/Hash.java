import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("abc@gmail.com");
        emails.add("def@yahoo.com");
        emails.add("abc@gmail.com");  // Duplicate

        System.out.println("Unique Emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}