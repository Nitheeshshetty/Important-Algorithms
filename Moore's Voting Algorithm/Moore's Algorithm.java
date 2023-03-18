import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }



//The Actual Algorithm is in this class
class Solution
{
    static int majorityElement(int a[], int n)
    {
        int cnt=0,ele=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=a[i];
            }
            else if(a[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(ele==a[i]){
                count++;
            }
        }
        if(count>n/2){
            return ele;
        }
        return -1;
    }
}
