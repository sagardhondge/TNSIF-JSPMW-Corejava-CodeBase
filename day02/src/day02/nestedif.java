package day02;

public class nestedif {
	public static void main(String[] args) {
		int a=10; int b=12;int c=13;
		System.out.println("laegest no is");
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
	}else {
		if(c>b) {
			System.out.println("c is greater");
	}
		else {
			System.out.println("b is greater");
		}
		}
}
}