<h2><a href="https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1">Undirected Graph Cycle </a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given an undirected graph with <b>V</b> vertices and <b>E</b> edges, represented as a 2D vector <b>edges[][]</b>, where each entry edges[i] = [u, v] denotes an edge between vertices u and v, determine whether the graph contains a cycle or not.</p>

<p><b>Note:</b> The graph can have multiple component.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> V = 4, E = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]
<strong>Output:</strong> true
<strong>Explanation:</strong>
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891735/Web/Other/blobid1_1743510240.jpg" />
1 -> 2 -> 0 -> 1 is a cycle.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> V = 4, E = 3, edges[][] = [[0, 1], [1, 2], [2, 3]]
<strong>Output:</strong> false
<strong>Explanation:</strong>
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891735/Web/Other/blobid2_1743510254.jpg" /> 
No cycle in the graph.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= V,E &lt;= 10<sup>5</sup></code></p>
<p><code>0 &lt;= edges[i][0], edges[i][1] &lt; V</code></p>
