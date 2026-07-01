<h2><a href="https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1">Rat in a Maze</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>Given a binary matrix <code>maze[][]</code> of size <code>n * n </code> containing values <code>0</code> and <code>1</code>, find all possible paths for a rat to travel from the source cell <code>(0, 0)</code> to the destination cell <code>(n - 1, n - 1)</code>. The rat can move in four directions: up(U), down(D), left(L), and right(R).</p>

<ul>
	<li>1 represents an open cell through which the rat can move.</li>
	<li>0 represents a blocked cell that cannot be traversed.</li>
</ul>

<p>The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.</p>

<p><code>Note:</code> Return the paths in <code>lexicographically</code> increasing order. If no valid path exists, return an empty list.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
<strong>Output:</strong> ["DDRDRR", "DRDDRR"]
<strong>Explanation:</strong> There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).
<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/929574/Web/Other/blobid0_1781254127.png' alt='maze image' />
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> maze[][] = [[1, 0], [1, 0]]
<strong>Output:</strong> []
<strong>Explanation:</strong> No path exists as the destination cell (1, 1) is blocked.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= n &lt;= 5</code></li>
	<li><code>0 &lt;= maze[i][j] &lt;= 1</code></li>
</ul>
