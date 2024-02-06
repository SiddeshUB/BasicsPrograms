public class MultiplicationMatrix {
	public static void main(String[] args) {
		
		int matrix1[][] ={
					{1,2,3},
					{4,5,6},
					{7,8,9}
				};
		int matrix2[][] ={
				{9,8,7},
				{6,5,4},
				{3,2,1}
			};
		System.out.println("Matrix 1:");
		printMatrix(matrix1);
		System.out.println("Matrix 2:");
		printMatrix(matrix2);
		System.out.println("Multiplication Matrix:");
		printMatrix(mulMatrix(matrix1,matrix2));
	}
	

	public static int[][] mulMatrix(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols1=matrix1[0].length;
		int cols2=matrix2[0].length;
		int result[][] = new int[rows][cols1];
		for(int i=0;i<=rows-1;i++) {
			for(int j=0;j<=cols1-1;j++) {
				for(int k=0;k<=cols2-1;k++) {
					result[i][j] +=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		return result;
	}


	public static void printMatrix(int[][] matrix) {
		for(int i=0;i<=matrix.length-1;i++) {
			for(int j=0;j<=matrix[i].length-1;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
