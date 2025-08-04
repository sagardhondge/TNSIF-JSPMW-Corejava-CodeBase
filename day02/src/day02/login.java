package day02;

public class login {

	public static void main(String[] args) {
		String username="sagardhondge";
		String passward="Sagar@123";
		
		if(username=="agardhondge") {
			if(passward=="Sagar@123") {
				System.out.println("Login is Successfully");
			}
			else {
				System.out.println("Wrong Passward Enter Again");
			}
		}
		else {
			 if (!(passward=="Sagar@123")) {
	                System.out.println("Username and password both are wrong");
	            } else {
	                System.out.println("You entered the wrong username");
	            }
		}

	}

}
