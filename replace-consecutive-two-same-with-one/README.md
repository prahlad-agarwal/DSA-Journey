<h2><a href="https://www.geeksforgeeks.org/problems/consecutive-elements2306/1">Replace Consecutive Two Same with One
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a string <code>s</code>, consisting of lowercase alphabets. Remove consecutive duplicate characters from the string. </p>

<p><strong class="example">Example:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aabb&quot;
<strong>Output:</strong> &quot;ab&quot;
<strong>Explanation:</strong> The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed. The final string is "ab".
</pre>

&nbsp;

<pre>
<strong>Input:</strong> s = &quot;aabaa&quot;
<strong>Output:</strong> &quot;aba&quot;
<strong>Explanation:</strong> The character 'a' at index 2 is the same as 'a' at index 1, so it is removed. The character 'a' at index 5 is the same as 'a' at index 4, so it is removed. The final string is "aba".
</pre>

&nbsp;

<pre>
<strong>Input:</strong> s = &quot;aaaa&quot;
<strong>Output:</strong> &quot;a&quot;
<strong>Explanation:</strong> &quot;aaaa&quot; => &quot;aaa&quot; => &quot;aa&quot; => &quot;a&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<p><code>1 &lt;= n &lt;= 10<sup>6</sup></code></p>
<p>All characters in the string are lowercase English alphabets.</p>
