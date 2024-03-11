public class grid {
  
  
    public static void main(String[] args) {
        int ways = gridway(0, 0, 3, 3);
        System.out.println("Number of ways to reach (3,3): " + ways);
    }

    public static int gridway(int i, int j, int n, int m) {
        // Base case: If the current position is the destination, return 1 (1 way)
        if (i == n-1 && j == m-1) {
            return 1;
        }

        // If the current position is out of bounds, return 0
        if (i == n || j == m) {
            return 0;
        }

        // Explore all possible moves (right and down) recursively
        int ways = gridway(i + 1, j, n, m) + gridway(i, j + 1, n, m);

        return ways;
    }
}

