import java.util.*;
import java.lang.Math;

class Sorting
{
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			new Solution().insertionSort(a,n);
			printArray(a,n);
		  t--;
		}
	}
}


class Solution
{
  static void insert(int arr[],int j)
  {
       arr[j+1]=arr[j];
  }
  public void insertionSort(int arr[], int n)
  {
      for(int i=0;i<n;i++){
          int temp=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>temp){
              insert(arr,j);
              j--;
          }
          arr[j+1]=temp;
      }
  }
}
