package conditional;

public class If_Demo {
 int a=10,b=100;
	
	 void only_If()
	{
		
		if(a>b)
		{

			System.out.println("IF CONDITION--a is greater");
		}
	}
	 void if_Else()
	{
		if(a>b)
		{
			System.out.println("IF ELSE --a is greater");
		}
		else
		{
			System.out.println("IF ELSE --b is greater");
		}
		
	}
	 void if_Else_if()
	{
		if(a>b)
		{
			System.out.println("IF ELSE IF--a is greater");
		}
		else if(a==10)
		{
			System.out.println("IF ELSE IF--a is equals to 10");
		}
		else if(b==12)
		{
			System.out.println("b is equal to 12");
		}
		else
		{
			System.out.println("IF ELSE IF--B is greater");
		}
	}
	 void nested_if()
	{
		if(a<b)
		{
		if(a==10)
		{
			System.out.println("NESTED IF--A is greater and equals to 10");
		}
		}
	}
	public static void main(String[] args) {
		If_Demo obj=new If_Demo();
		
		//obj.only_If();
		//obj.if_Else();
		obj.if_Else_if();
		//obj.nested_if();
	}

}
