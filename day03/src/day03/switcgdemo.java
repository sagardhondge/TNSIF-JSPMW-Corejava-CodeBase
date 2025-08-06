package day03;

public class switcgdemo {

	public static void main(String[] args) {
		int userinput=1;
		switch(userinput)
		{
		case 1:
			System.out.println(userinput + ":new offers");
			break;
		case 2:
			System.out.println(userinput +":10% Discount");
			break;
		case 3:
			System.out.println(userinput + ":Talk to customer person");
		case 4:
			System.out.println(userinput + ":need Help");
		default :
			System.out.println(userinput + ":wrong information");
		}
		

	}

}
