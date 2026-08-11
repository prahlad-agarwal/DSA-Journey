<h2><a href="https://www.geeksforgeeks.org/problems/shortest-unique-prefix-for-every-word/1>Shortest Unique Prefix for Every Word </a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr>

<p>Given an array of strings <b>arr[]</b>, find the shortest prefix of each string that uniquely identifies it among all strings in the array. A prefix is unique if it is not a prefix of any other string in the array.</p>

<p><b>Note:</b> No string in the given array is a prefix of another string.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong>  arr[] = ["zebra", "dog", "duck", "dove"]
<strong>Output:</strong> ["z", "dog", "du", "dov"]
<strong>Explanation:</strong> z => zebra, dog => dog, duck => du, dove => dov 
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> arr[] = ["geeksgeeks", "geeksquiz", "geeksforgeeks"]
strong>Output:</strong>["geeksg", "geeksq", "geeksf"]
<strong>Explanation:</strong> geeksgeeks => geeksg, geeksquiz => geeksq, geeksforgeeks => geeksf
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<p>1 ≤ length of arr, length of each word ≤ 1000</p>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= |arr| &lt;= 1000</code></p>
<p><code>1 &lt;= |arr[i]| &lt;= 1000</code></p>
