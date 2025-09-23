package taxcalculation;

import java.util.Scanner;

public class persondemo {

	public static void main(String[] args) {
		
		//scanner class
		//scanner object to accept user inputs
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter Person Name");
		String name=ob.next();
		System.out.println("Enter Person Email");
		String email=ob.next();
		System.out.println("Enter age");
		int age=ob.nextInt();
		System.out.println("Enter gender");
		String gender=ob.next();
		System.out.println("Enter income");
		int income=ob.nextInt();
		
		
		//person class object and intialize vlaues
		person person=new person();
		person.setName(name);
		person.setEmail(email);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);

//		calling an object one by one thorugh this method 	
//		System.out.println(person.getAge());
//		System.out.println(person.getGender());
//		System.out.println(person);

//		using to string we can call all the object at once
		Taxcalculate calc=new Taxcalculate();
		calc.calculateTax(person);
		System.out.println("after calculation of tax");
		
		System.out.println(person);
		
		
	}

}
