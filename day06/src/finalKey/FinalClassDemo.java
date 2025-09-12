package finalKey;

final class FinalClass{
	
	void show () {
		System.out.println("final class cannot be inherited");
	}
}

//class Demo extends  FinalClass{
//	
//}

public class FinalClassDemo {

	public static void main(String[] args) {
		FinalClass f1=new FinalClass();
		f1.show();
	}
}
