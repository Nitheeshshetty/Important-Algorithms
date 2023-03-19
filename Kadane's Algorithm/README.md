 Kadane’s algorithm is used to find the sum of the contiguous subarray within a array with the largest sum. The idea of this algorithm is to maintain a variable max_ending_here that stores the maximum sum contiguous subarray ending at current index and a variable max_so_far stores the maximum sum of contiguous subarray found so far, Everytime there is a positive-sum value in max_ending_here compare it with max_so_far and update max_so_far if it is greater than max_so_far.
<br/>
<br/>
Steps to be followed in this algorithm is:
-----------------------------------------
     ->Initialize the variables max_so_far = Integer.MIN_VALUE and max_ending_here = 0
     ->Run a for loop from 0 to N-1 and for each index i: 
         (i) Add the arr[i] to max_ending_here.
         (ii) If  max_so_far is less than max_ending_here then update max_so_far  to max_ending_here.
         (iii) If max_ending_here < 0 then update max_ending_here = 0
     ->Return max_so_far
