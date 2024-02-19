
class Solution {

    void printTriangle(int n) {
        
        for (int i = 1; i <= n; i++) {
            // Print each number i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
