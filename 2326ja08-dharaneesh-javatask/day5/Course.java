import java.util.*;
public class Course {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String student = sc.nextLine();
            ArrayList<String> courses = new ArrayList<>();

            System.out.print("Enter number of courses: ");
            int c = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < c; j++) {
                System.out.print("Enter course name: ");
                String course = sc.nextLine();
                courses.add(course);
            }

            studentCourses.put(student, courses);
        }

        System.out.println("\nStudent Course Details:");
        for (Map.Entry<String, ArrayList<String>> entry : studentCourses.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}