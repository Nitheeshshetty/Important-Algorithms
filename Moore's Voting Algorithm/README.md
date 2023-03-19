The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.
<br/>
<br/>
<br/>
Steps to implement the algorithm:
---------------------------------
Step 1 – Find a candidate with the majority
-----------------------------------------------
        ->Initialize a variable say i ,cnt = 0, ele =0 
        ->Traverse through the array using for loop
        ->If cnt = 0, choose the ele = arr[i] , make cnt=1.
        ->else if the current element is the same as the candidate(ele) increment cnt
        ->else decrement cnt.

Step 2 – Check if the candidate has more than N/2 votes
---------------------------------------------------------
        ->Initialize a variable count =0 and increment count if it is the same as the candidate(ele).
        ->If the count is >N/2, return the candidate.
        ->else return -1.
