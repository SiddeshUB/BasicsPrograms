/*Program to take user input*/
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
//		creating the scanner object from scanner class
		Scanner scan = new Scanner(System.in);
//		massage  to enter the user input
		System.out.println("Enter the input");
//		taking the user input and store it in int type variable
		int input = scan.nextInt();
//		printing the entered input
		System.out.println(input);
	}
}
