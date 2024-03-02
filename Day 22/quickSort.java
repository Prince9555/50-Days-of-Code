import java.util.*;

class Sorting {
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver program
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      new Solution().quickSort(arr, 0, n - 1);
      printArray(arr);
      T--;
    }
  }
}
// } Driver Code Ends

class Solution {
  // Function to sort an array using quick sort algorithm.
  static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    // code here
    int pidx = partition(arr, si, ei);
    quickSort(arr, si, pidx - 1);
    quickSort(arr, pidx + 1, ei);
  }

  static int partition(int arr[], int si, int ei) {
    // your code here
    int pivot = arr[ei];
    int i = si - 1;
    for (int j = 0; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;

  }
}
