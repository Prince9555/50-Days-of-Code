import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends

class Pair{
    int x;
    int y;
    int des;
    public Pair(int x,int y,int des){
        this.x = x;
        this.y = y;
        this.des = des;
    }
}

class Solution
{
    
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n)
    {
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };        
        
        Queue<Pair> q = new LinkedList<>();
        boolean visited[][] = new boolean[n+1][n+1];
        q.add(new Pair(knightPos[0],knightPos[1],0));
        visited[knightPos[0]][knightPos[1]] = true;
        
        while(!q.isEmpty()){
            Pair val = q.poll();
            if(val.x == targetPos[0] && val.y== targetPos[1]){
                return val.des;
            }
            for(int i=0;i<8;i++){
                int r = val.x + dx[i];
                int c = val.y + dy[i];
                if(isExist(r,c,n) && !visited[r][c]){
                    visited[r][c] = true;
                    q.add(new Pair(r,c,val.des+1));
                }
            }
        }
        return -1;
    }
    public static boolean isExist(int r,int c,int n){
        if(r<=0 || r>n || c<=0 ||c>n){
            return false;
        }
        return true;
    }

}