<h2><a href="https://www.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1">Search array with adjacent diff at most k
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a step array <code>arr[]</code>, its step value <code>k</code> , and a key <code>x</code> ,we need to find the index of key <code>x</code> in the array <code>arr[]</code>. If multiple occurrences of key <code>x</code> exist, return the <code>first</code> occurrence of the key. In case of <code>no</code> occurrence of key <code>x</code> exists return <code>-1</code>.</p>

<p>Note: A step array is an array of integers where the difference between adjacent elements is at most <code>k</code>. For example: arr[] = [4, 6, 7, 9] and k = 2 is a step array as the difference between the adjacent elements in the <code>arr[]</code> is at most <code>2</code>.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> arr[] = [4, 5, 6, 7, 6] , k = 1 , x = 6
<strong>Output:</strong> 2
<strong>Explanation:</strong> In an array arr 6 is present at index 2. So, return 2.
</pre>

&nbsp;

<pre>
<strong>Input:</strong>  arr[] = [20, 40, 50], k = 20 , x = 70
<strong>Output:</strong> -1
<strong>Explanation:</strong> As there is no occurrence of 70. So, return -1.
</pre>
