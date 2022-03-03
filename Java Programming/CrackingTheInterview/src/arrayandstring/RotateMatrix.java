package arrayandstring;

public class RotateMatrix {
	static int[][] matrix;
	
	public static int[][] rotate() {
		int[][] newMatrix = new int[matrix.length][matrix.length];
		int col = 0;
		int row = 0;
		for(int j=0; j<matrix.length; j++) {
			for(int i=matrix.length-1; i>=0; i--) {
				newMatrix[col][row] = matrix[i][j];
				row++;
			}
			row = 0;
			col++;
		}
		return newMatrix;
	}
	
	public static void showMatrix(int[][] matrix) {
		int size = matrix.length;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		matrix = new int[5][5];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = i*j;
			}
		}
		
		showMatrix(matrix);
		matrix = rotate();
		showMatrix(matrix);
		
	}

}
