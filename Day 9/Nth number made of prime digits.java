class Solution {
    // Function to check if a number is made up of prime digits only
    public static boolean isPrimeDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // Function to find nth number made of only prime digits
    public static int primeDigits(int n) {
        int count = 0;
        int num = 2; // Start with the first prime number

        while (true) {
            if (isPrimeDigits(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++; // Move to the next number
        }
    }

}