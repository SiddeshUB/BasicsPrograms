import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String in=scan.nextLine();
		ReverseString r = new ReverseString();
		System.out.println(r.reverseStr(in));
	}
	public String reverseStr(String str) {
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			newStr +=str.charAt(i);
		}
		return newStr;
	}
}
