package lab;

public class Function {
	public static void main(String[]args) {
		int a = 5;
		int b = 3;
		add(a,b);
		sub(a,b);
		mult(a,b);
		div(a,b);

	}
	public static void  add(int x, int y) {
		System.out.println(x+y);
	}
	public static void  sub(int x, int y) {
		System.out.println(x-y);
	}
	public static void  mult(int x, int y) {
		System.out.println(x*y);
	}
	public static void  div(int x, int y) {
		System.out.println(x/y);
	}

		
}
