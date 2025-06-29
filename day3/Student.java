class Student {
    String name;
    int[] marks = new int[3];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int total() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public double average() {
        return total() / 3.0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total());
        System.out.println("Average: " + average());
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78};
        Student student = new Student("Ravi", marks);
        student.display();
    }
}