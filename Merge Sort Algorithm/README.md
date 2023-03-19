Merge sort is a sorting algorithm that works by dividing an array into smaller subarrays, sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.
In simple terms, we can say that the process of merge sort is to divide the array into two halves, sort each half, and then merge the sorted halves back together. This process is repeated until the entire array is sorted.
<br/>
Time complexity of this algorithm is O(N*logN)
<br/>
<br/>

The Algorithmic Steps are:
--------------------------
    1. At first, check if the left index of array is less than the right index, if yes then calculate its mid point .
    2. Now, as we already know that merge sort first divides the whole array iteratively into equal halves, unless the atomic values are achieved. 
    3. Now, again find that is left index is less than the right index for both arrays, if found yes, then again calculate mid points for both the arrays.
    4. Now, further divide these two arrays into further halves, until the atomic units of the array is reached and further division is not possible.
    5. After dividing the array into smallest units, start merging the elements again based on comparison of size of elements.
    6. Firstly, compare the element for each list and then combine them into another list in a sorted manner.
