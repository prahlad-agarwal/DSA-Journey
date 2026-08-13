<h2><a href="https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1">BFS of graph </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-lightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a <b>connected undirected graph</b> containing <b>V</b> vertices, represented by a 2-d adjacency list <b>adj[][]</b>, where each adj[i] represents the list of vertices connected to vertex i. Perform a <b>Breadth First Search (BFS)</b> traversal starting from vertex 0, visiting vertices from left to right according to the given adjacency list, and return a list containing the BFS traversal of the graph.</p>

<p><b>Note:</b> Do traverse in the <b>same order</b> as they are in the given <b>adjacency list</b>.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700217/Web/Other/blobid0_1728648582.jpg" />
<strong>Output:</strong> [0, 2, 3, 1, 4]
<strong>Explanation:</strong> Starting from 0, the BFS traversal will follow these steps: 
Visit 0 → Output: 0 
Visit 2 (first neighbor of 0) → Output: 0, 2 
Visit 3 (next neighbor of 0) → Output: 0, 2, 3 
Visit 1 (next neighbor of 0) → Output: 0, 2, 3, 1
Visit 4 (neighbor of 2) → Final Output: 0, 2, 3, 1, 4
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700217/Web/Other/blobid1_1728648604.jpg" />
<strong>Output:</strong> [0, 1, 2, 3, 4]
<strong>Explanation:</strong> Starting from 0, the BFS traversal proceeds as follows: 
Visit 0 → Output: 0 
Visit 1 (the first neighbor of 0) → Output: 0, 1 
Visit 2 (the next neighbor of 0) → Output: 0, 1, 2 
Visit 3 (the first neighbor of 2 that hasn't been visited yet) → Output: 0, 1, 2, 3 
Visit 4 (the next neighbor of 2) → Final Output: 0, 1, 2, 3, 4
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= V = adj.size() &lt;= 10<sup>4</sup></code></p>
<p><code>0 &lt;= adj[i][j] &lt;= 10<sup>4</sup></code></p>
