package arrayandstring;

public class ZeroMatrix {
	static final int M = 5;
	static final int N = 3;
	static int[][] matrix = new int[N][M];
	
	public static void makeZeroInRow(int n) {
		for(int i=0; i<M; i++) {
			matrix[n][i] = 0;
		}
	}
	
	public static void makeZeroInColumn(int m) {
		for(int i=0; i<N; i++) {
			matrix[i][m] = 0;
		}
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
		boolean[][] isZeroMatrix = new boolean[N][M];
		for(int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				
				matrix[i][j] = (i+1) * (j+1);
				
			}
		}
		
		matrix[1][1] = 0;
		
		for(int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if(matrix[i][j] == 0) {
					isZeroMatrix[i][j] = true;
				}
			}
		}
		boolean didRow = false;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(isZeroMatrix[i][j]) {
					if(!didRow) {
						makeZeroInRow(i);
						didRow = true;
					}
					makeZeroInColumn(j);
				}
				didRow = false;
			}
		}
		
		showMatrix(matrix);
	}

}
