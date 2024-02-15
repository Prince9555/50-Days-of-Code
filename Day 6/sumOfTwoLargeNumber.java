
class Solution {
    String findSum(String X, String Y) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = X.length() - 1;
        int j = Y.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += X.charAt(i--) - '0';
            if (j >= 0)
                sum += Y.charAt(j--) - '0';
            result.append(sum % 10);
            carry = sum / 10;
        }
        
        if (carry > 0)
            result.append(carry);
        
        result.reverse();
        
        // Remove leading zeros
        int k = 0;
        while (k < result.length() && result.charAt(k) == '0')
            k++;
        
        if (k == result.length())
            return "0"; // If the result is all zeros
        else
            return result.substring(k);
    }
}
