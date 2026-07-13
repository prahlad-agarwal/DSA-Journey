<h2><a href="https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1">Left View of Binary Tree </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given the <b>root</b> of a binary tree. Your task is to return the <b>left view</b> of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is <b>viewed</b> from the <b>left side</b>.</p>

<p><b>Note:</b> If the tree is empty, return an empty list.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> root = [1, 2, 3, 4, 5, N, N]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/876845/Web/Other/blobid0_1731456264.png' alt='example1 image input' />

<strong>Output:</strong> [1, 2, 4]
<strong>Explanation:</strong> From the left side of the tree, only the nodes 1, 2, and 4 are visible.

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/876845/Web/Other/blobid1_1731456288.png' alt='example1 image explanation' />
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/876845/Web/Other/blobid2_1731456332.png' alt='example2 image input' />

<strong>Output:</strong> [1, 2, 4, 5]
<strong>Explanation:</strong> From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

<img src='https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/876845/Web/Other/blobid3_1731456373.png' alt='example2 image explanation' />
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>0 &lt;= number of nodes &lt;= 10<sup>5</sup></code></p>
<p><code>0 &lt;= node -> data &lt;= 10<sup>5</sup></code></p>
