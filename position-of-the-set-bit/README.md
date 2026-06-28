<h2><a href="https://www.geeksforgeeks.org/problems/find-position-of-set-bit3706/1">Position of the Set Bit
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Basic' /><hr>

<p>Given an integer <code>n</code>, determine position of the <code>only set bit</code> (1) in its binary representation. The position is counted starting from 1 at the least significant bit (LSB).</p>

<ul>
	<li>If n contains exactly one set bit, return its position.</li>
	<li>If n contains no set bits or more than one set bit, return <code>-1</code>.</li>
</ul>

<p>&nbsp;</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> 2 is represented as <code>"10"</code> in binary. It has only one set bit, which is at position 2.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> n = 5
<strong>Output:</strong> -1
<strong>Explanation:</strong> 5 is represented as <code>"101"</code> in binary. It has two set bits; therefore, the output is -1.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= n &lt;= 10<sup>8</sup></code></li>
</ul>
