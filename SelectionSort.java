public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {40,30,70,60,80,90,50};
		int sortarr[]=selectionSort(arr);
		for(int x:sortarr) {
			System.out.print(x+" ");
		}
	}

	public static int[] selectionSort(int[] arr) {
		int temp;
		for(int i=0;i<=arr.length-2;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min<arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i] =temp;
		}
		return arr;
	}
}
