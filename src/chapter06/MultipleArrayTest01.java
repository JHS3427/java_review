package chapter06;

public class MultipleArrayTest01 {

	public static void main(String[] args) {
		// 3*3(=3행3열 매트릭스 만들기 3가지
		int[][] matrix = new int[3][3];
		
		int[][] matrix2 = new int[3][];
		matrix2[0] = new int[3];
		matrix2[1] = new int[3];
		matrix2[2] = new int[3];
		
		int matrix3[][] = {{10,20,30},{40,50,60},{70,80,90}};
		matrix[0][0] = 100;
		matrix[2][1] = 500;
		
		for (int i=0;i<matrix.length ;i++) {
			for(int j=0;j<matrix.length ;j++)
			{
				//System.out.print(matrix[i][j]+" ");
				System.out.print("["+i+" , "+j+"] = "+matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i=0;i<matrix.length ;i++) {
			for(int j=0;j<matrix.length ;j++)
			{
				//System.out.print(matrix[i][j]+" ");
				System.out.print("["+i+" , "+j+"] = "+matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i=0;i<matrix3.length ;i++) {
			for(int j=0;j<matrix3.length ;j++)
			{
				//System.out.print(matrix[i][j]+" ");
				System.out.print("["+i+" , "+j+"] = "+matrix3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
