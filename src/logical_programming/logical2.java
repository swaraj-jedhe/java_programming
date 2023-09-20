package logical_programming;

public class logical2 {

	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		System.out.println("before swapping");
		System.out.println("A "+a);
		
		System.out.println("B "+b);
		System.out.println("after swappping");
		a=a+b;//10+20=30
		b=a-b;// 30-20=10 b=10
		a=a-b;//30-10=20 a=20
		System.out.println("A "+a);
		System.out.println("B "+b);
	}
}
