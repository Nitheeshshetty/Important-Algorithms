Depth-first search is an algorithm for traversing or searching tree or graph data structures. The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking. 
So the basic idea is to start from the root or any arbitrary node and mark the node and move to the adjacent unmarked node and continue this loop until there is no unmarked adjacent node. Then backtrack and check for other unmarked nodes and traverse them. Finally, print the nodes in the path.
<br/>
<br/>
Follow the below steps to solve the problem :
--------------------------------------------
    1. Create a recursive function that takes the index of the node and a visited array.
    2. Mark the current node as visited and print the node.
    3. Traverse all the adjacent and unmarked nodes and call the recursive function with the index of the adjacent node.
