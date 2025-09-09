//package day1;
//
//public class Typecasting {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package day01;

public class Typecasting {

	public static void main(String[] args) {
		//widing/narrowing  
		byte b=10;
		int l=b;
		System.out.println(l);
		
		//float to double
		float f=12.23f;
		double d=f;
		System.out.println(d);
		
		//
		
		// char to int
		char ch = 'A';
		int i=ch;
		System.out.println(i);
		
		//narrowing
		
		//double to long
		double fl =10.52f;
		long ll = (long)fl;
		System.out.println(ll);
		
		//int to byte
		int i2 = 130;
		byte bl=(byte)i2;
		System.out.print(bl);
	}

}
