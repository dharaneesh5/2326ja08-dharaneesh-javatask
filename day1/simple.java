package practice;

import java.util.Scanner;

public class Simple
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principal: ");
    double principal = sc.nextDouble();
    System.out.print("Enter Rate of Interest: ");
    double rate = sc.nextDouble();
    System.out.print("Enter Time (in years): ");
    double time = sc.nextDouble();
    double simpleInterest = 0;

    if (principal > 0 && rate > 0 && time > 0)
    {
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    } else 
    {
        System.out.println("Please enter positive values for all inputs.");
    }

    sc.close();
}

}