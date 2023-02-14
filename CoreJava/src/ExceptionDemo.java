import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : An exception is an abnormal condition that arises during the run time of a program is 
 * called exception.
 * - Mainly 2 types of Exception
 * 1. Checked - Compile time
 * 2. Unchecked - Run time
 * - To handle exception there are mainly 5 keywords are used.
 * 
 * 1. try
 * 2. catch
 * 3. throw
 * 4. throws
 * 5. finally
 * 
 * */

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Start Code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
		}catch(ArithmeticException e) {
			System.out.println("Exception Caught : "+e);
		}catch(InputMismatchException e) {
			System.out.println("Exception Caught : "+e);
		}
		System.out.println("End Code");
	}
}
