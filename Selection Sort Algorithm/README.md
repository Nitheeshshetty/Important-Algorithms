The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.1->The subarray which is already sorted and 2->Remaining subarray which is unsorted.In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
<br/>
<br/>
The Algorithmic steps are :
--------------------------
    1. Set the first element as minimum.
    2. Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.
        Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.
    3. After each iteration, minimum is placed in the front of the unsorted list.
    4. For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.
