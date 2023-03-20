Floyd’s cycle finding algorithm or Hare-Tortoise algorithm is a pointer algorithm that uses only two pointers, moving through the sequence at different speeds. This algorithm is used to find a loop in a linked list. It uses two pointers one moving twice as fast as the other one. The faster one is called the fast pointer and the other one is called the slow pointer.
<br/>
<br/>
Steps to be followed in this Algorithm are :
--------------------------------------------
    1. Initialize two-pointers and start traversing the linked list.
    2. Move the slow pointer by one position.
    3. Move the fast pointer by two positions.
    4. If both pointers meet at some point then a loop exists and if the fast pointer meets the end position then no loop exists.
