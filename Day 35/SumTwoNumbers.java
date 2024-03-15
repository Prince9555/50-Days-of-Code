import java.util.ArrayList;
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Add the numbers to the ArrayList
        numbers.add(num1);
        numbers.add(num2);
        
        // Calculate the sum using a standard for loop
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        
        // Display the sum
        System.out.println("The sum of the two numbers is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
