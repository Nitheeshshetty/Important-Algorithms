import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}



class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
        ArrayList<Integer>ans=new ArrayList<Integer>();
        ans.add(0);
        for(int i=0;i<V;i++)
            dfs(i,adj,visited,ans);
        return ans;
    }
    
    public void dfs(int vertex,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer>ans)
    {
        visited[vertex]=true;
        
        for(int neighbour:adj.get(vertex)){
            if(visited[neighbour]==false){
                ans.add(neighbour);
                dfs(neighbour,adj,visited,ans);
            }
        }
    }
}
