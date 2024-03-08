/**
 * ArrayBacktrack
 */
public class ArrayBacktrack {

  public static void ChangeArr(int arr[], int a, int b) {
    if (a == arr.length) {
      printArr(arr);
      return;
    }
    arr[a] = b;
    ChangeArr(arr, a + 1, b + 1);
    arr[a] = arr[a] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    ChangeArr(arr, 0, 1);
    printArr(arr);

  }
}