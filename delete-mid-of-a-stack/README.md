<h2><a href="https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1">Delete Mid of a Stack </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a stack <code>s</code>, delete the <code>middle element</code> of the stack without using any additional data structure.</p>

<p><code>Middle element:-</code> floor((size_of_stack+1)/2) (1-based indexing) from the bottom of the stack.</p>

<p><code>Note:</code> The output shown by the compiler is the stack from top to bottom.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> s = [10, 20, 30, 40, 50]
<strong>Output:</strong> [50, 40, 20, 10]
<strong>Explanation:</strong> The bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> s = [10, 20, 30, 40]
<strong>Output:</strong> [40, 30, 10]
<strong>Explanation:</strong> The bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> s = [5, 8, 6, 7, 6, 6, 5, 10, 12, 9]
<strong>Output:</strong> [9, 12, 10, 5, 6, 7, 6, 8, 5]
</pre>


<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= element of stack &lt;= 10<sup>5</sup></code></li>
	<li><code>2 &lt;= s.size() &lt;= 10<sup>4</sup></code></li>

</ul>
