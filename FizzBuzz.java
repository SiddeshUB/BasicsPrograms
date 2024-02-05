import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		int num=100;
		findFizzBuzz(num);
	}

	public static void findFizzBuzz(int num) {
		List<Integer> fizz = new ArrayList<Integer>(); 
		List<Integer> buzz = new ArrayList<Integer>();
		List<Integer> fizzbuzz = new ArrayList<Integer>();
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				fizz.add(i);
			}
			if(i%5==0) {
				buzz.add(i);
			}
			if(i%3==0 && i%5==0 ) {
				fizzbuzz.add(i);
			}
		}
		System.out.println("Fizz "+fizz);
		System.out.println("Buzz "+buzz);
		System.out.println("FizzBuzz "+fizzbuzz);
	}
}
