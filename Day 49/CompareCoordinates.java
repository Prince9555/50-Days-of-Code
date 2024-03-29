import java.util.Scanner;

public class CompareCoordinates {

    public static int compareCoordinates(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return Math.max(y1, y2);
        } else {
            return -1; // If x-coordinates are not equal, return -1 or handle accordingly
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n (1 to 10):");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Invalid value of n. It should be between 1 and 10.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter x1 for set " + i + ":");
            int x1 = scanner.nextInt();
            System.out.println("Enter y1 for set " + i + ":");
            int y1 = scanner.nextInt();
            System.out.println("Enter x2 for set " + i + ":");
            int x2 = scanner.nextInt();
            System.out.println("Enter y2 for set " + i + ":");
            int y2 = scanner.nextInt();

            int result = compareCoordinates(x1, y1, x2, y2);
            if (result != -1) {
                System.out.println("For set " + i + ", the maximum y-coordinate is: " + result);
            } else {
                System.out.println("For set " + i + ", the x-coordinates are not equal.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
