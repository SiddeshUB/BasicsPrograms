import java.util.Scanner;
public class FactorialCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		System.out.println("Factorial of "+input+" is "+findFactorial(input));
	}

	private static int  findFactorial(int input) {
		int fact=1;
		for(int i=1;i<=input;i++) {
			fact*=i;
		}
		return fact;
	}
}
