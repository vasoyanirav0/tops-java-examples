
/*
 * Method Overloading : When there is a more than one method in a single class having the same name but with
 * a different number of arguments & their data types then it is called method overloading. 
 * 
 * */

public class MethodOverloading {

	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 argument");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 argument");
	}
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test(10);
		m.test();
		m.test(10,20);
		
	}
}
