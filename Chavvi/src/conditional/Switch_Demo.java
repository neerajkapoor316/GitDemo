package conditional;

public class Switch_Demo {

	public static void main(String[] args) {

		
		String choice="RED";
		switch(choice)
		{
		case "RED":
			
			System.out.println("STOP");
			break;
		case "YELLOW":
			System.out.println("WAIT");
			break;
		case "GREEN":
			System.out.println("GO");
			break;
			default:
				System.out.println("WRONG CHOICE");
			
		}
	}

}
