package HierarchicalInheritanceDemo;

public class Student extends Person{

	private String clas;
	private float percent;
	
	//default dconstructor
	public Student() {
		System.out.println("Student class default constructor ");
		clas="FY";
		percent=75f;
		
	}

	public Student(String name, String city,String clas, float percent) {
		super( name,  city);
		this.clas = clas;
		this.percent = percent;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
}