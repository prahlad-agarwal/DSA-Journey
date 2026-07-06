<h2><a href="https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1">Reverse first K of a Queue </a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>GGiven an integer <code>k</code> and a queue of integers, we need to reverse the order of the first <code>k</code> elements of the queue, leaving the other elements in the same relative order.</p>

<p>Only following standard operations are allowed on queue.</p>

<ul>
	<li>enqueue(x) : Add an item x to rear of queue</li>
	<li>dequeue() : Remove an item from front of queue</li>
	<li>size() : Returns number of elements in queue.</li>
	<li>front() : Finds front item.</li>
</ul>

<p>&nbsp;</p>

<p><code>Note:</code> The above operations represent the general processings. In-built functions of the respective languages can be used to solve the problem.</p>

<p>"If the size of queue is smaller than the given k , then return the original queue."</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> q = [1, 2, 3, 4, 5], k = 3
<strong>Output:</strong> [3, 2, 1, 4, 5]
<strong>Explanation:</strong> After reversing the first 3 elements from the given queue the resultant queue will be 3 2 1 4 5
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> q = [4, 3, 2, 1], k = 4
<strong>Output:</strong>  [1, 2, 3, 4] 
<strong>Explanation:</strong> After reversing the first 4 elements from the given queue the resultant queue will be 1 2 3 4 
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= q[i] &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= q.size() &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>

</ul>
