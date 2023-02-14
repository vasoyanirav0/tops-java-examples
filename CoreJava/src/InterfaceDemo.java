
/*
 * Interface : It is look like a class but it is not a class.
 * - Since it is not a class, we cannot create an object of it.
 * - By default all the methods of the interface is abstract.
 * - To define methods declared in interface, a class have to implement that interface using implements keyword.
 * - once class implements an interface, a class must have to define all the methods of the interface.
 * - One class can implement more than one interface.   
 * - One interface is implemented by more than one interface.
 * - Inheritance of interface is also possible.
 * */
interface ifs1
{
	void meth1();
	static void meth2()
	{
		System.out.println("Meth2 Defined In Interface");
	}
}
interface ifs2
{
	void meth3();
	void meth4();
}
interface ifs3 extends ifs2
{
	void meth5();
}
public class InterfaceDemo implements ifs1,ifs3{
	public void meth1() {
		System.out.println("Meth1");
	}
	
	public void meth3() {
		System.out.println("Meth3");
	}
	public void meth4() {
		System.out.println("Meth4");
	}public void meth5() {
		System.out.println("Meth5");
	}
	
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth1();
		ifs1.meth2();
		i.meth3();
		i.meth4();
		i.meth5();
	}
}
