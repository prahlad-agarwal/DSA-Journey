<h2><a href="https://www.geeksforgeeks.org/problems/leaf-at-same-level/1">Leaves at Same Level or Not </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given the <code><b>root</b></code> of a binary tree, determine whether all its <code><b>leaf nodes</b></code> are present at the same level. Return <code><b>true</b></code> if all leaf nodes are at the same level, and <code><b>false</b></code> otherwise.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong>  root = [12, 5, 7, 3, N, N, 1]

<img src='https://media.geeksforgeeks.org/wp-content/uploads/20260331113747893976/1.webp' alt='example1 image input' />

<strong>Output:</strong> true
<strong>Explanation:</strong> The tree has two leaf nodes: 1 and 3. Both leaf nodes are present at the same level, so the output is true. 
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [12, 5, 7, 3, N]

<img src='https://media.geeksforgeeks.org/wp-content/uploads/20260331113953199988/nodes_at_same_level_2.webp' alt='example2 image input' />

<strong>Output:</strong> false
<strong>Explanation:</strong> The leaf nodes are 3 and 7. Node 3 is at a deeper level than node 7, so all leaf nodes are not at the same level.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [3]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927942/Web/Other/blobid2_1778218890.png' alt='example3 image input' />

<strong>Output:</strong> true
<strong>Explanation:</strong> There is only one leaf node, so all leaf nodes are at the same level.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= n &lt;= 10<sup>5</sup></code></p>
