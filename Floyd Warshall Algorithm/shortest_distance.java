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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}




class Solution
{
    public void shortest_distance(int[][] mat)
    { 
        int n=mat.length;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                {
                    if(mat[i][k]==-1 || mat[k][j]==-1)
                        continue;
                    if(mat[i][j]==-1 || mat[i][k]+mat[k][j]<mat[i][j])
                        mat[i][j]=mat[i][k]+mat[k][j];
                }
            }
        }
    }
}
