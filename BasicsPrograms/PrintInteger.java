/*Print integer in java*/

import java.util.Scanner;
public class PrintInteger {
	public static void main(String[] args) {
//		Create Scanner object from scanner class
		Scanner scan = new Scanner(System.in);
//		Message to enter the number
		System.out.println("Enter the number");
//		Take the user input and store it in integer variable
		int n = scan.nextInt();
//		printing the first nth Natural number using for loop
		System.out.print("[");
		for(int i=1;i<=n;i++) {
			if(i>=1 && i<n) {
			System.out.print(i+",");
			}
			else {
				System.out.print(i);
			}
		}
		System.out.print("]");
	}
}
