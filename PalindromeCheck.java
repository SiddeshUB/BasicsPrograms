import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();
		checkPalindrome(input);
	}
	public static void checkPalindrome(String str) {
		String s1 = str;
		String s2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			s2+=str.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
}
