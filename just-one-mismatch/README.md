<h2><a href="https://www.geeksforgeeks.org/problems/just-one-mismatch1714/1">Just One Mismatch </a></h2> <img src='https://img.shields.io/badge/Difficulty-Basic-lightgreen' alt='Difficulty: Basic' /><hr>

<p>Given a string <b>s</b> and an array of strings <b>arr[]</b>, find if any string in arr[] of the same length as s differs from it at exactly one position. </p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> arr[] = ["bana", "apple", "banaba", "bonaba"], s = "banana"
<strong>Output:</strong> true
<strong>Explanation:</strong> "banana" and "banaba" have the same length and differ at exactly one position.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> arr[] = ["bana", "apple", "banaba", "bonanzo"], s = "apple"
<strong>Output:</strong> false
<strong>Explanation:</strong> No string in the array differs from "apple" by exactly one character.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<p><code>1 &lt;= arr.size() &lt;= 100</code></p>
<p><code>1 &lt;= |arr[i]|, |s| &lt;= 10<sup>3</sup></code></p>
