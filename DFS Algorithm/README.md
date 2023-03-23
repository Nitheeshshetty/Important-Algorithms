Depth-first search is an algorithm for traversing or searching tree or graph data structures. The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking. 
So the basic idea is to start from the root or any arbitrary node and mark the node and move to the adjacent unmarked node and continue this loop until there is no unmarked adjacent node. Then backtrack and check for other unmarked nodes and traverse them. Finally, print the nodes in the path.
<br/>
<br/>
Follow the below steps to solve the problem :
--------------------------------------------
        1. First, create a stack with the total number of vertices in the graph.
        2. Now, choose any vertex as the starting point of traversal, and push that vertex into the stack.
        3. After that, push a non-visited vertex (adjacent to the vertex on the top of the stack) to the top of the stack.
        4. Now, repeat steps 3 and 4 until no vertices are left to visit from the vertex on the stack's top.
        5. If no vertex is left, go back and pop a vertex from the stack.
        6. Repeat steps 2, 3, and 4 until the stack is empty.
