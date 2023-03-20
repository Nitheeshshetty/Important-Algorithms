QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.
<br/>
<br/>
The steps involved in this algorithm are :
------------------------------------------
    1. Choose the highest index value has pivot
    2. Take two variables to point left and right of the list excluding pivot
    3. left points to the low index
    4. right points to the high
    5. while value at left is less than pivot move right
    6. while value at right is greater than pivot move left
    7. if both step 5 and step 6 does not match swap left and right
    8. if left ≥ right, the point where they met is new pivot
