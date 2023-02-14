
/*
 * Polymorphisam : One name multiple form.
 * 
 * 1. Method Override(Run time): When there is a same method prototype in your both base class & derived class
 * & if you call that method using the object of derived class then only derived class method will be called.
 * So you can say that method of derived class overrides the method of base class.
 * 
 * */
class A1
{
	A1()
	{
		System.out.println("A1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show from A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show from B1");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show from C1");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
	}
}
