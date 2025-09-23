package staticblockmethod;

public class MyClassdemo {

	public static void main(String[] args) {

		MyClass.display();
		
		System.out.println();
		
		MyClass o1=new MyClass();
		System.out.println(o1);
		
		//static method with class name 
		MyClass.display();
		
	System.out.println();
		
		MyClass o2=new MyClass();
		System.out.println(o2);
		MyClass.display();  //srNo=1002,  section=
		
System.out.println();
		
		MyClass o3=new MyClass();
		System.out.println(o3);
		MyClass.display(); 
	}

}
