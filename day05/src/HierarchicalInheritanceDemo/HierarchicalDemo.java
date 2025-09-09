package HierarchicalInheritanceDemo;


public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
		Person p;
		p=new Person("Sagar","Pune");
		System.out.println(p);
		
		p=new Employee("Ram", "nashik", 1002, 23456, "QA");
		System.out.println(p);
		
		p=new Student("Prem", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
		

	}

}