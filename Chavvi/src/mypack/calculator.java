package mypack;


class A

{
	void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of two no's"+c);
	}
}
class B
{
	void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Subtraction of two no's"+c);
		
		
	}
}





public class calculator {

	public static void main(String[] args) {
A obj=new A();


B obj1=new B();
obj1.sub();
obj.sum();
	}

}
