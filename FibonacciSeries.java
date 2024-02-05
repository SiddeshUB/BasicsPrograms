import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		findFibonacci(input);
	}
	public static void findFibonacci(int input) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.print("FibonacciSeries of "+input+" is ");
		for(int i=0;i<input;i++) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
