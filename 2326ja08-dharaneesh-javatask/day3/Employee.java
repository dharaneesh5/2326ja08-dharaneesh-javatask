class Person {
    String name;
    int age;
}

class Employee extends Person {
    double salary;

    public Employee(String name, int age, double salary)
     {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, 45000);
        emp.display();
    }
}