
class Solution {
    String shortestPath(String S) {
        int n = 0, s = 0, e = 0, w = 0;
        
        // Count occurrences of each direction
        for (char ch : S.toCharArray()) {
            if (ch == 'N') n++;
            else if (ch == 'S') s++;
            else if (ch == 'E') e++;
            else if (ch == 'W') w++;
        }
        
        StringBuilder shortestPath = new StringBuilder();
        
        // Handle north and south movements
        if (n > s) shortestPath.append("N".repeat(n - s));
        else if (s > n) shortestPath.append("S".repeat(s - n));
        
        // Handle east and west movements
        if (e > w) shortestPath.append("E".repeat(e - w));
        else if (w > e) shortestPath.append("W".repeat(w - e));
        
        // Construct the lexicographically smallest path
        String path = shortestPath.toString();
        char[] sortedPath = path.toCharArray();
        Arrays.sort(sortedPath);
        
        return new String(sortedPath);
    }
}
