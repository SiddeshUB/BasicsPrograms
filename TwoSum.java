public class TwoSum {
	public static void main(String[] args) {
		int []num= {2,11,15,7};
		int target = 9;
		int a[] = findTwoSum(num,target);
		System.out.println("Indices of target sum "+target+" is "+a[0]+","+a[1]);
	}

	private static int[] findTwoSum(int[] num, int target) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target ) {
					int a[]= {i,j};
					return a;
				}
			}
		}
		return null;
	}
}
