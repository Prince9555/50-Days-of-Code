class Solution {
  boolean sameFreq(String s) {
      int[] frequencies = new int[26]; // Assuming only lower alphabetic characters are present
      
      // Count frequencies of each character
      for (char c : s.toCharArray()) {
          frequencies[c - 'a']++;
      }
      
      // Find the maximum and minimum frequencies
      int minFreq = Integer.MAX_VALUE, maxFreq = Integer.MIN_VALUE;
      for (int freq : frequencies) {
          if (freq != 0) { // Skip characters with zero frequency
              minFreq = Math.min(minFreq, freq);
              maxFreq = Math.max(maxFreq, freq);
          }
      }
      
      // If all characters have the same frequency, or if removing one character can make all frequencies equal
      if (minFreq == maxFreq || (maxFreq - minFreq == 1 && (countOccurrences(frequencies, maxFreq) == 1 || countOccurrences(frequencies, minFreq) == 1))) {
          return true;
      }
      
      return false;
  }
  
  // Helper method to count occurrences of a frequency in the array
  int countOccurrences(int[] arr, int value) {
      int count = 0;
      for (int num : arr) {
          if (num == value) {
              count++;
          }
      }
      return count;
  }
}