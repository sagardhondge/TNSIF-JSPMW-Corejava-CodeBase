package taxcalculation;

public class person {
//	data
	private String name;
	private String email;
	private int income;
	private int age;
	private String gender;
	private int tax;
	

//	public static void main(String[] args) {
//		System.out.println("hii");
//
//	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	public int getIncome() {
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getTax() {
		return tax;
	}


	public void setTax(int tax) {
		this.tax = tax;
	}


	@Override
	public String toString() {
		return "person [name=" + name +  ",email=" + email +", income=" + income + ", age=" + age + ", gender=" + gender + ", tax=" + tax
				+ "]";
	}
	
	

}
