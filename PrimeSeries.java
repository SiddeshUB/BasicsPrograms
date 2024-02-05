import java.util.Scanner;
public class PrimeSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		System.out.print("Prime no from 1-"+input+": ");
		findPrime(input);
		System.out.print("Even Prime: ");
		findEvenPrime(input);
		System.out.print("Odd Prime: ");
		findoddPrime(input);
	}
	private static void findoddPrime(int num) {
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0 && i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void findEvenPrime(int num) {
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0 && i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void findPrime(int num) {
		for(int i=1;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
}
