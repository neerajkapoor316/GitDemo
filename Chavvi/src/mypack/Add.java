package mypack;

public class Add {
	int a=10;
	int b=20;
	int c;
	void sum()
	{
			
		 c=a+b;
			System.out.println("Addition of two no's"+c);
	}
	void sub()
	{
			 c=a-b;
		System.out.println("Subtraction of two no's"+c);
		
	}
	
	public static void main(String[] args) {
		Add obj=new Add();
		obj.sum();
		obj.sub();
	}

}
