package oopsconcept;

public class Eancapsulationdemo{
	public static void main(String[] args) {
		
		//object creation

		OopsConceptDemo obj=new OopsConceptDemo();
		
		obj.setAge(34);
		obj.setName("Manoj");
		obj.setSerialNum(12345);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSerialNum());
		
		System.out.println(obj);

	}
	
}

