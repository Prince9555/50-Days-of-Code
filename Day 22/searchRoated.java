import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution { 
    static int Search(int array[], int target) {
        return search(array, 0, array.length - 1, target);
    }

    static int search(int array[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (array[mid] == target) {
            return mid;
        }

        if (array[si] <= array[mid]) {
            if (array[si] <= target && target <= array[mid]) {
                return search(array, si, mid - 1, target);
            } else {
                return search(array, mid + 1, ei, target);
            }
        } else {
            if (array[mid] <= target && target <= array[ei]) {
                return search(array, mid + 1, ei, target);
            } else {
                return search(array, si, mid - 1, target);
            }
        }
    }
}
