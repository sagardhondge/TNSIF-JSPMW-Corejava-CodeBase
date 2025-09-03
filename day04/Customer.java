package day05;

public class Customer {

	//data members 
	protected String customername;
	private int customerId;
	private String customerCity;
	
	//Default Constructor 
	public Customer() {
		System.out.println("Default COnstructor");
	}

	//parametriozed constructor 
	public Customer(String customername, int customerId, String customerCity) {
		super();
		this.customername = customername;//shubham
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
	//getter and setter 
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	//to string
	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}

}