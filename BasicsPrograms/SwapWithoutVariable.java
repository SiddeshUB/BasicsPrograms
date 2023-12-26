/*Program to swap two number without using 3rd variable*/
public class SwapWithoutVariable {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
//		Before swapping those values
		System.out.println("Before Swapping");
		System.out.println("x:"+x+"\n"+"y:"+y);
//		swapping the values without using third variable
		x = x+y;
		y = x-y;
		x = x-y;
//		After swapping the values in the variables
		System.out.println("After Swapping");
		System.out.println("x:"+x+"\n"+"y:"+y);
	}
}
