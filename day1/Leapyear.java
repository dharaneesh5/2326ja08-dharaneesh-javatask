
import java.util.Scanner;

public class Leap {
	    public static boolean isLeapYear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public static void main(String[] args) {
         Scanner year=new Scanner(System.in);
         System.out.println("Enter the year");
         int a=year.nextInt();
	        if (isLeapYear(a)) {
	            System.out.println(a + " is a Leap Year");
	        } else {
	            System.out.println(a + " is Not a Leap Year");
	        }
	        year.close();
	    }
	}
