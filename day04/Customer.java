package day05;

public class Customer {
	
	// private  member;
	private String Customername;
	private int customerId;
	private String customerCity;
	
	
	
	//default constructor
	public Customer() {
		super();
	}
	//parameterized constructor
	
	public Customer(String customername, int customerId, String customerCity) {
		super();
		Customername = customername;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}


	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
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
	
	
	
	
}
