public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,90,100};
		int key=80;
		System.out.println(binarySearch(arr,key));
		
	}

	private static String binarySearch(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		int mid= (low+high)/2;
		while(low<=high) {
			if(key==arr[mid]) {
				return("Key is found at index "+mid);
			}
			else if(key>arr[mid]) {
				low = mid+1;
				mid = (low+high)/2;
			}
			else {
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		return "Key is not found in the array";
	}
}
