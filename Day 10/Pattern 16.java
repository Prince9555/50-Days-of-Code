
class Solution {

    void printTriangle(int n) {
               char ch='A';

   for (int i = 1; i <= n; i++) {
            // Print each number i times
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
