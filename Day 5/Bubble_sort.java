class Solution {
    int select(int arr[], int i, int n) {
        int min_index = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_index])
                min_index = j;
        }
        return min_index;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = select(arr, i, n);
            swap(arr, i, min_index);
        }
    }

    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

