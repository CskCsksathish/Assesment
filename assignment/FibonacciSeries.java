package week1.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		System.out.println("Fibonacci series");
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;b<=8;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
