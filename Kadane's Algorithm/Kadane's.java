import java.io.*;

class Main { 
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution obj = new Solution();
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


//The actual algo present in this class
class Solution{
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        int max_so_far=Integer.MIN_VALUE;
            int max_ending=0;
            for(int i=0;i<n;i++){
                max_ending=max_ending+arr[i];
                if(max_so_far<max_ending){
                    max_so_far=max_ending;
                }
                if(max_ending<0){
                    max_ending=0;
                }
            }
            return max_so_far;
    }
    
}

