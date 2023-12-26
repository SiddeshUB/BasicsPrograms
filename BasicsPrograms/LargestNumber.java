import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
//		create scanner object using scanner class
		Scanner scan = new Scanner(System.in);
//		take the user input and store it in variables
		System.out.println("Enter the three number");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
//		check the number which is greater using if-else condition
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" n1 is greater");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+" n2 is greater");
		}
		else {
			System.out.println(n3+" n3 is greater");
		}
	}
}
