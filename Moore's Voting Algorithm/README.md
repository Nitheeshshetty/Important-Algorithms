The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.
<br/>
<br/>
<br/>
Steps to implement the algorithm:
---------------------------------
Step 1 – Find a candidate with the majority<br/>
+++++++++++++++++++++++++++++++++++++++++++
<br/>   ->Initialize a variable say i ,votes = 0, candidate =-1 
<br/>   ->Traverse through the array using for loop
<br/>   ->If votes = 0, choose the candidate = arr[i] , make votes=1.
<br/>   ->else if the current element is the same as the candidate increment votes
<br/>   ->else decrement votes.
<br/>
<br/>

Step 2 – Check if the candidate has more than N/2 votes<br/>
+++++++++++++++++++++++++++++++++++++++++++++++++++++++
</br>   ->Initialize a variable count =0 and increment count if it is the same as the candidate.
<br/>   ->If the count is >N/2, return the candidate.
<br/>   ->else return -1.
