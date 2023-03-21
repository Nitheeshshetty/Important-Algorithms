Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
This algorithm is one of the simplest algorithm with simple implementation.
Basically, Insertion sort is efficient for small data values.
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
<br/>
<br/>
Steps involved in this algorithm are : 
-------------------------------------
    1. The procedure takes a single argument, ‘A’, which is a list of sortable items.
    2. The variable ‘n’ is assigned the length of the array A.
    3. The outer for loop starts at index ‘1’ and runs for ‘n-1’ iterations, where ‘n’ is the length of the array.
    4. The inner while loop starts at the current index i of the outer for loop and compares each element to its left neighbor. If an element is smaller than its left neighbor, the elements are swapped.
    5. The inner while loop continues to move an element to the left as long as it is smaller than the element to its left.
    6. Once the inner while loop is finished, the element at the current index is in its correct position in the sorted portion of the array.
    7. The outer for loop continues iterating through the array until all elements are in their correct positions and the array is fully sorted.
