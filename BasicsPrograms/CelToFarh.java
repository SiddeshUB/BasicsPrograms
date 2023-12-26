/*Program to convert temperature celcius to fahrenhite*/
import java.util.Scanner;
public class CelToFarh {
	public static void main(String[] args) {
//		create scanner object using scanner class
		Scanner scan = new Scanner(System.in);
//		message to enter the temperature
		System.out.println("Enter the temperature in celcius");
//		Take the input and store it in double type variable
		double celcius = scan.nextDouble();
//		convert temperature in celcius to farhenheit 
		double fahrenheit = (9.0/5.0*celcius)+32;
		System.out.println("Temperature celcius to farhenheit :"+fahrenheit);
//		convert temperature in farhenheit to celcius 
		double celcius1 = 5.0/9.0*(fahrenheit-32);
		System.out.println("Temperature farhenheit to celcius :"+celcius1);
	}
}
