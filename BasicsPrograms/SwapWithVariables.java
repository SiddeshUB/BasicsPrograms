/*Program to swap two number using 3rd variable*/
public class SwapWithVariables {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
//		Before swapping those values
		System.out.println("Before Swapping");
		System.out.println("x:"+x+"\n"+"y:"+y);
//		swapping the values using third variable
		int z = x;
		x = y;
		y = z;
//		After swapping the values in the variables
		System.out.println("After Swapping");
		System.out.println("x:"+x+"\n"+"y:"+y);
	}
}
