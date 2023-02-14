public class StaticMethod {

	static int a=10;
	static int b;
	
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	{
		System.out.println("Block 2");
	}
	static
	{
		System.out.println("Static Block Intialized");
		b=a*4;
	}
	public StaticMethod() {
		System.out.println("Static Method Constructor Called");
	}
	public static void main(String[] args) {
		StaticMethod m=new StaticMethod();
		meth(12);
		
	}
	{
		System.out.println("Block 3");
	}
}
