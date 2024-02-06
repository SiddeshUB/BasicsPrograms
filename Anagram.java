import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		System.out.println(str1+"\n"+str2);
		if(isAnagram(str1,str2)) {
			System.out.println(str1+" and "+str2+" is Anagram" );
		}
		else {
			System.out.println(str1+" and "+str2+" is not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if (str1.length()!=str2.length()) {
			return false;
		}
		char ch1[] =str1.toCharArray();
		char ch2[] =str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		str1 = new String(ch1);
		str2 = new String(ch2);
		System.out.println(str1+"\n"+str2);
		return str1.equals(str2);
	}
}
