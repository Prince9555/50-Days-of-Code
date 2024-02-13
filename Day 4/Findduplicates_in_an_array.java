
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] += 1;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (index == n) {
                count++;
                continue;
            }
            int val = arr[index];
            if (val < 0) {
                res.add(index);
                arr[index] = Math.abs(arr[index]);
            } else {
                arr[index] = -arr[index];
            }
        }
        
        if (count > 1) {
            res.add(n - 1);
        }
        
        // Removing duplicate occurrences from the result
        ArrayList<Integer> distinctRes = new ArrayList<>(new HashSet<>(res));
        
        if (distinctRes.isEmpty()) {
            distinctRes.add(-1);
        } else {
            Collections.sort(distinctRes);
        }
        
        return distinctRes;
    }
}
