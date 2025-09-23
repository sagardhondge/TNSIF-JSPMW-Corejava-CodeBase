package staticblockmethod;

public class MyClass {

	private int section;  // non static varible or instance varible
	
	private static int srNo;
	
	//static block 
	static {
		System.out.println("-----Within static block-----");
		srNo=1000;
		//section=2000;
	}
	
	MyClass()
	{
		System.out.println("------Within Default constructor-----");
		srNo++; //
		section++;
		
	}

	//to String 
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section : "+ section);
		System.out.println("Searial No :"+ srNo);
	}
	
	
	
}