import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Ravi", 85);
        marksMap.put("Priya", 92);
        marksMap.put("Amit", 78);

        int total = 0;
        for (int marks : marksMap.values()) {
            total += marks;
        }

        double average = total / (double) marksMap.size();

        System.out.println("Student Marks:");
        for (String name : marksMap.keySet()) {
            System.out.println(name + ": " + marksMap.get(name));
        }

        System.out.println("Average Marks: " + average);
    }
}