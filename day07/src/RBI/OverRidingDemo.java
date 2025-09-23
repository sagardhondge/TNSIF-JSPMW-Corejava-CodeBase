// overiding demo
package RBI;

public class OverRidingDemo {
    public static void main(String[] args) {
    	
    	// Dynamic binding assigning child class object to parent class 
    	RBI rbi;
    	
    	rbi= new RBI();
    	System.out.println(rbi.getRateofInterest());
    	
    	
    	rbi= new SBI();
    	System.out.println(rbi.getRateofInterest());
    	
    	
    	rbi= new ICIC();
    	System.out.println(rbi.getRateofInterest());
    
    	rbi= new HDFC();
    	System.out.println(rbi.getRateofInterest());
    
    
    }
}
