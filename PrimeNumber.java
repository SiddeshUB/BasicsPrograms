import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		checkPrimeNumber(num);
	}
	public static void checkPrimeNumber(int num) {
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("Number is not primenumber");
		}
		else {
			System.out.println("Number is primenumber");
		}
	}
}
