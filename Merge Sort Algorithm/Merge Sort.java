import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	  static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

	public static void main(String args[])
	{
		   Scanner sc = new Scanner(System.in);
		   int T = sc.nextInt();
		   while(T>0)
		   {
		      //taking elements count
			    int n = sc.nextInt();
			    //creating an object of class Merge_Sort
			    Merge_Sort ms = new Merge_Sort();
			    //creating an array of size n
			    int arr[] = new int[n];
			    //adding elements to the array
			    for(int i=0;i<n;i++)
				    arr[i] = sc.nextInt();   
			    Solution g = new Solution();
			    //calling the method mergeSort
			    g.mergeSort(arr,0,arr.length-1);
            //calling the method printArray
			    ms.printArray(arr);
		      T--;
		  }
	  }
}


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int aa[]=new int[n1];
        int bb[]=new int[n2];
        for(int i=0;i<n1;i++){
            aa[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            bb[j]=arr[j+m+1];
        }
        
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
           if(aa[i]<=bb[j]){
               arr[k]=aa[i];
               i++;
           }else{
               arr[k]=bb[j];
               j++;
           }
           k++;
        }
        while(i<n1){
            arr[k++]=aa[i++];
        }
        while(j<n2){
            arr[k++]=bb[j++];
        }
   }
   void mergeSort(int arr[], int l, int r)
   {
       if(l<r){
           int mid=(l+r)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,r);
           merge(arr,l,mid,r);
       }
   }
}
