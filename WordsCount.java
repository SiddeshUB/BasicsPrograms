import java.util.*;
public class WordsCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		countwords(str);
	}

	private static void countwords(String str) {
		String[] arr = str.split(" ");
		System.out.println("No of words in string :"+arr.length);
	}
}
