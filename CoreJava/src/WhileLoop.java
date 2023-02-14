import java.util.Scanner;

/*
 * while loop
 * 
 * while(condition)
 * {
 * 		body
 * }
 * 
 * 1. Entry controlled loop.
 * 2. No semicolon after while.
 * 3. If condition false at first then no execution.
 * 
 * do-while loop
 * 
 * do
 * {
 * 		body
 * }while(condition);
 * 
 * 1. Exit controlled loop.
 * 2. Semicolon after while.
 * 3. If condition false at first still minimum one time execution.
 * 
 * */

public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		do
		{
			System.out.println("Tops Technologies");
			n=n-1;
		}while(n>0);
	}
}
