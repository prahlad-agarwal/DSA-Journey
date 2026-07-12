<h2><a href="https://www.geeksforgeeks.org/problems/transform-to-sum-tree/1">Transform to Sum Tree </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a root of a binary tree with <b>n</b> nodes, where each node may contain positive or negative values, convert it into a tree such that each node’s new value is equal to the sum of all values in its left and right subtrees (based on the original tree). For leaf nodes, update their values to 0.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> root = [10, -2, 6, 8, -4, 7, 5]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927138/Web/Other/blobid0_1777031541.png' alt='example1 image input' />

<strong>Output:</strong>

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928701/Web/Other/blobid0_1779515228.webp' alt='example1 image output' />

<strong>Explanation:</strong> 
Leaf nodes update: The leaf nodes 8, -4, 7, 5 are changed to 0 since they have no children.
Update internal nodes: Left child: 8 + (-4) = 4
Right child: 7 + 5 = 12
Update root node: Root = sum of left and right subtree values = 4 - 2 + 12 + 6 = 20
<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700185/Web/Other/blobid1_1779463267.webp' alt='example1 image explanation' />
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [1, 2, 3, 4, 5, -6, 2]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928701/Web/Other/blobid1_1779515394.webp' alt='example2 image input' />

<strong>Output:</strong>

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928701/Web/Other/blobid2_1779515431.webp' alt='example2 image output' />

<strong>Explanation:</strong> 
Leaf nodes update: The leaf nodes 4, 5, -6, 2 are changed to 0 since they have no children.
Update internal nodes: Left child: 4 + 5 = 9
Right child: -6 + 2 = -4
Update root node: Root = sum of left and right subtree values = 9 + 2 + 3 + (-4) = 10
<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/928701/Web/Other/blobid0_1779515764.webp' alt='example2 image explanation' />
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= n &lt;= 10<sup>4</sup></code></p>
