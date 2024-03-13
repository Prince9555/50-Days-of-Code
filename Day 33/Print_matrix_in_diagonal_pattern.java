import java.util.Scanner;

class Print_matrix_in_diagonal_pattern {

  public static void main(String[] args) {
    int n = 3;
    int mat[][] = new int[n][n];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    
    Print_matrix_in_diagonal_pattern printMatrix = new Print_matrix_in_diagonal_pattern();
    int[] result = printMatrix.matrixDiagonally(mat);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
  public int[] matrixDiagonally(int[][] mat) {
    int n = mat.length;
    int[] arr = new int[n * n];
    int idx = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        for (int j = 0, k = i; j <= i; j++, k--) {
          arr[idx++] = mat[k][j];
        }
      } else {
        for (int j = 0, k = i; j <= i; j++, k--) {
          arr[idx++] = mat[j][k];
        }
      }
    }

    for (int i = 1; i < n; i++) {
      if ((n - i) % 2 == 1) {
        for (int r = n - 1, c = i; c < n; c++, r--) {
          arr[idx++] = mat[r][c];
        }
      } else {
        for (int r = n - 1, c = i; c < n; c++, r--) {
          arr[idx++] = mat[c][r];
        }
      }
    }
    return arr;
  }
}