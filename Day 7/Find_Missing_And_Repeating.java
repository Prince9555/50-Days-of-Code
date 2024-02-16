

public class Find_Missing_And_Repeating {
    
        int[] findTwoElement(int arr[], int n) {
            int repeating = -1;
            int missing = -1;
    
            // Cyclic Sort
            int i = 0;
            while (i < n) {
                if (arr[i] != i + 1) {
                    int correctIndex = arr[i] - 1;
                    if (arr[i] != arr[correctIndex]) {
                        // Swap arr[i] and arr[correctIndex]
                        int temp = arr[i];
                        arr[i] = arr[correctIndex];
                        arr[correctIndex] = temp;
                    } else {
                        // Found repeating element
                        repeating = arr[i];
                        i++;
                    }
                } else {
                    i++;
                }
            }
    
            // Find missing element
            for (i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    missing = i + 1;
                    break;
                }
            }
    
            int[] result = new int[2];
            result[0] = repeating;
            result[1] = missing;
            return result;
        }
    
    }

