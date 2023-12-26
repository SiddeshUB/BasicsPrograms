/*Program to find the Addition of two number*/
import java.util.Scanner;
public class Add2Num {
	public static void main(String[] args) {
//		create scanner object using scanner class
		Scanner scan = new Scanner(System.in);
//		take the user input and store it in variables
		System.out.println("Enter the two number");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
//		after addition of two numbers 
		System.out.println("Addition of "+n1+" and "+n2+" number is "+ (n1+n2));
	}
}
