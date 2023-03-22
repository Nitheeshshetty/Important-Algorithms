The breadth-first search (BFS) algorithm is used to search a tree or graph data structure for a node that meets a set of criteria. It starts at the tree’s root or graph and searches/visits all nodes at the current depth level before moving on to the nodes at the next depth level. Breadth-first search can be used to solve many problems in graph theory.Graphs may contain cycles, so we may come to the same node again. To avoid processing a node more than once, we divide the vertices into two categories i.e Visited and Not visited.A boolean visited array is used to mark the visited vertices.
<br/>
<br/>
Follow the below steps to implement BFS traversal :
---------------------------------------------------
    1. Declare a queue and insert the starting vertex.
    2. Initialize a visited array and mark the starting vertex as visited.
    3. Follow the below process till the queue becomes empty:
        ->Remove the first vertex of the queue.
        ->Mark that vertex as visited.
        ->Insert all the unvisited neighbors of the vertex into the queue.
