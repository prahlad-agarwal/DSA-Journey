<h2><a href="https://www.geeksforgeeks.org/problems/right-view-of-binary-tree/1">Right View of Binary Tree </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given the <b>root</b> of a binary tree. Return the <b>right view</b> of the binary tree. The right view of a binary tree is the set of nodes visible when the tree is <b>viewed</b> from the <b>right side</b>.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> root = [1, 2, 3, N, N, 4, 5]

<img src='https://media.geeksforgeeks.org/wp-content/uploads/20240909100757/2_2.webp' alt='example1 image input' />

<strong>Output:</strong> [1, 3, 5]
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [1, 2, 3, 4, N, N, N, N, 5]

<img src='https://media.geeksforgeeks.org/wp-content/uploads/20240909100541/Right-view-in-binary-tree-1.webp' alt='example2 image input' />

<strong>Output:</strong> [1, 3, 4, 5]
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [3]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700153/Web/Other/blobid0_1777967002.png' alt='example3 image input' />

<strong>Output:</strong> [3]
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= number of nodes &lt;= 10<sup>5</sup></code></p>
<p><code>0 &lt;= node -> data &lt;= 10<sup>5</sup></code></p>
