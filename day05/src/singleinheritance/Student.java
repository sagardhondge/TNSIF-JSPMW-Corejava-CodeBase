package singleinheritance;

public class Student extends Citizen{
	//data members
		
		private int rollNo;
		private String collegename;
		
		//non para constructor 
		public Student() {
			super();
		}

		public Student(String name, String adharNo, String address, long phone,int rollNo, String collegename) {
			super( name,  adharNo,  address,  phone);
			this.rollNo = rollNo;
			this.collegename = collegename;
		}

		//getter and setter
		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getCollegename() {
			return collegename;
		}

		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", collegename=" + collegename + ", getName()=" + getName()
					+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
					+ "]";
		}
	}