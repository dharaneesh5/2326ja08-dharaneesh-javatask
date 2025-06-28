import java.util.*;
public class Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Divya");
        students.add("Kiran");

        Iterator<String> iterator = students.iterator();
        System.out.println("Students List:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}