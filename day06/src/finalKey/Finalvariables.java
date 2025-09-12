package finalKey;

public class Finalvariables {

	//final int x;  final should br initialized
	
	final int x=100;
	
	//declare a static blank final variable 
	final static int y;
	
	final static int z=10;
	
	
	//instance method 
	void change () {
		//x=30;
		//z=100;
		//y=23;
		
	}


	@Override
	public String toString() {
		return "Finalvariables [x=" + x + ", y=" + y +"]";
	
	}
	
	//declare a static block 
	static 
	{
		//z=89;
		y=20;
	
		System.out.println("value of Y : "+ y);
	}	
}
