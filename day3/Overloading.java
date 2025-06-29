
public class Overloading {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println("Sum (int): " + obj.sum(5, 10));
        System.out.println("Sum (double): " + obj.sum(5.5, 3.2));
    }
}
