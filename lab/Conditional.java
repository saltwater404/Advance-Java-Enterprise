package lab;

public class Conditional {
	public static void main(String[]args) {
		int a = 4;
		int b = 7;
		int c = 1;
		
		if(a>b && a>c) {
			System.out.println("A is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println("B is the largest number");
		}
		else if(c>b && c>a) {
			System.out.println("C is the largest number");
		}
	}

}
