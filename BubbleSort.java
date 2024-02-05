
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {40,30,70,60,80,90,50};
		int sortarr[]=bubbleSort(arr);
		for(int x:sortarr) {
			System.out.print(x+" ");
		}
	}
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-i-2;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
