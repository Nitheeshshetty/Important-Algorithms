import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}



class Solution
{
	void  select(int arr[], int i,int min)
	{
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
	}
  
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n;i++){
	        int min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[min]){
	                min=j;
	            }
	        }
	        if(min!=i){
	            select(arr,i,min);
	        }
	    }
	}
}
