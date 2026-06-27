<h2><a href="https://www.geeksforgeeks.org/problems/permutations-in-array1747/1">Permutations in array
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given two arrays <code>arr1[], arr2[]</code>, and an integer <code>k</code> .The task is to check if after permuting both arrays in such a way, we get the sum of their corresponding element greater than or equal to <code>k</code> i.e. <code>arr1i + arr2i >= k</code> for all i (from <code>0</code> to <code>n-1</code> .Return <code>true</code> if possible, else <code>false</code>.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> k = 10, arr1[] = [2, 1, 3], arr2[] = [7, 8, 9]. 
<strong>Output:</strong> true
<strong>Explanation:</strong> Permutation  arr1[] = [1, 2, 3] and arr2[] = [9, 8, 7] satisfy the condition arr1[i] + arr2[i] >= k
</pre>

&nbsp;

<pre>
<strong>Input:</strong> k = 5, arr1[] = [1, 2, 2, 1], arr2[] = [3, 3, 3, 4].
<strong>Output:</strong> false
<strong>Explanation:</strong> Since any permutation won't give the answer.
</pre>
