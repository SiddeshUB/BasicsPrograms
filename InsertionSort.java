public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {40,30,70,60,80,90,50};
		int sortarr[]=insertionSort(arr);
		for(int x:sortarr) {
			System.out.print(x+" ");
		}
	}

	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && item>arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] =item; 
		}
		return arr;
	}
}
