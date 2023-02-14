import java.util.Scanner;

/*Inheritance : The object of one class acquire the properties of object of another class is called inheritance.
 * - Creating a new class from an existing class is called inheritance.
 * 1. Single
 * 2. Multilevel
 * 3. Multiple - Not Supported In Java
 * 4. Hierarchical
 * 5. Hybrid - Not Supported In Java
 * 
 * */
class A
{
	int a;
	Scanner sc=new Scanner(System.in);
	void getA()
	{
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	Scanner sc=new Scanner(System.in);
	void getB()
	{
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C extends A
{
	int c;
	Scanner sc=new Scanner(System.in);
	void getC()
	{
		System.out.print("Enter C : ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		c1.getA();
		b1.getB();
		c1.getC();
		b1.putA();
		b1.putB();
		c1.putC();
	}
}
