public class DuplicateArray {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,10,20};
		findDuplicate(arr);
	}
	public static void findDuplicate(int[] arr) {
		System.out.print("Duplicate elements:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
