package oopsconcept;

public class oopsconceptdemo {
	
	//data members as private we can make our class as encapsulated
	private int serialNum;
	private String name;
	private int age;
	
	//setter / para constructor - assign the values /set the value 
	//to string - get read /getter

	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//object class method - to return string representation of the object 
	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	

}
