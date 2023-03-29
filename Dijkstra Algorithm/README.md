Dijkstra algorithm is one of the prominent algorithms to find the shortest path from the source node to a destination node. It uses the greedy approach to find the shortest path. The concept of the Dijkstra algorithm is to find the shortest distance (path) starting from the source point and to ignore the longer distances while doing an update.It is important to note that Dijkstra’s algorithm is only applicable when all weights are positive because, during the execution, the weights of the edges are added to find the shortest path.
<br/>
<br/>
Follow the steps below to solve the problem :
---------------------------------------------
    -> Create a set sptSet (shortest path tree set) that keeps track of vertices included in the shortest path tree, i.e., whose minimum distance from the source is calculated and finalized. Initially, this set is empty. 
    -> Assign a distance value to all vertices in the input graph. Initialize all distance values as INFINITE. Assign the distance value as 0 for the source vertex so that it is picked first. 
    -> While sptSet doesn’t include all vertices 
        i. Pick a vertex u that is not there in sptSet and has a minimum distance value. 
        ii. Include u to sptSet. 
        iii. Then update the distance value of all adjacent vertices of u. 
                -To update the distance values, iterate through all adjacent vertices. 
                -For every adjacent vertex v, if the sum of the distance value of u (from source) and weight of edge u-v, is less than the distance value of v, then update the distance value of v. 
