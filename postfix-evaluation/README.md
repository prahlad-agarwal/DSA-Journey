<h2><a href="https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1">Postfix Evaluation</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given an array of strings <code>arr[]</code> that represents a valid arithmetic expression written in <code>Reverse Polish Notation</code> (Postfix Notation). Your task is to evaluate the expression and return an integer representing its value.</p>

<p><code>Note:</code> A postfix expression is of the form operand1 operand2 operator (e.g., "a b +"). </p>

<p>And the division operation between two integers always computes the floor value, i.e floor(5 / 3) = 1 and floor(-5 / 3) = -2.</p>

<p>It is guaranteed that the result of the expression and all intermediate calculations will fit in a 32-bit signed integer.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> arr[] = ["2", "3", "1", "*", "+", "9", "-"]
<strong>Output:</strong> -4
<strong>Explanation:</strong> If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> arr[] = ["2", "3", "^", "1", "+"]
<strong>Output:</strong> 9
<strong>Explanation:</strong> If the expression is converted into an infix expression, it will be 2 ^ 3 + 1 = 8 + 1 = 9.
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= arr.size() &lt;= 10<sup>3</sup></code></li>
	<li><code>arr[i] is either an operator: "+", "-", "*", "/" or "^", or an integer in the range [-10<sup>4</sup>, 10<sup>4</sup>]</code></li>
</ul>
