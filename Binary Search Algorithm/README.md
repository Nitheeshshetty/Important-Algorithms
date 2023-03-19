Binary search is one of the searching techniques applied when the input is sorted as here we are focusing on finding the middle element that acts as a reference frame whether to go left or right to it as the elements are already sorted. 
The function returns an index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). The insertion point is defined as the point at which the key would be inserted into the array.
<br/>
<br/>
The Algorithmic steps are written below:
----------------------------------------
    1.Sort the array in ascending order.
    2.Set the low index to the first element of the array and the high index to the last element.
    3.Set the middle index to the average of the low and high indices.
    4.If the element at the middle index is the target element, return the middle index.
    5.If the target element is less than the element at the middle index, set the high index to the middle index – 1.
    6.If the target element is greater than the element at the middle index, set the low index to the middle index + 1.
    7.Repeat steps 3-6 until the element is found or it is clear that the element is not present in the array.
