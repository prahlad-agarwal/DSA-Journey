<h2><a href="https://www.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1>Unique rows in boolean matrix </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a binary matrix your task is to find all unique rows of the given matrix in the order of their appearance in the matrix.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong>  mat[][] = [[1 1 0 1], 
                [1 0 0 1],
                [1 1 0 1]]

<strong>Output:</strong> [[1 1 0 1],
        [1 0 0 1]]
<strong>Explanation:</strong> The two unique rows are R1: [1 1 0 1] and R2: [1 0 0 1]. 
As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> mat[][] = [[0 0 0 1],
                [0 0 0 1]]

strong>Output:</strong> [0 0 0 1]
<strong>Explanation:</strong> Only unique row is [0 0 0 1].
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= n, m &lt;= 40</code></p>
<p><code>0 &lt;= mat[i][j] &lt;= 1</code></p>
