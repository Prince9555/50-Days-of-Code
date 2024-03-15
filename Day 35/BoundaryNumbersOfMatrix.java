import java.util.ArrayList;

public class BoundaryNumbersOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayList<Integer> boundaryNumbers = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Adding top row
        for (int i = 0; i < cols; i++) {
            boundaryNumbers.add(matrix[0][i]);
        }

        // Adding right column (excluding first and last element to avoid duplicates)
        for (int i = 1; i < rows - 1; i++) {
            boundaryNumbers.add(matrix[i][cols - 1]);
        }

        // Adding bottom row in reverse order
        for (int i = cols - 1; i >= 0; i--) {
            boundaryNumbers.add(matrix[rows - 1][i]);
        }

        // Adding left column (excluding first and last element to avoid duplicates)
        for (int i = rows - 2; i > 0; i--) {
            boundaryNumbers.add(matrix[i][0]);
        }

        // Print the boundary numbers
        System.out.println("Boundary numbers of the matrix:");
        for (int num : boundaryNumbers) {
            System.out.print(num + " ");
        }
    }
}
