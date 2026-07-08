<h2><a href="https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1">Infix to Postfix </a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr>

<p>You are given a string <code>s</code> representing an <code>infix expression</code>. Convert this infix expression to a postfix expression.</p>

<p>&nbsp;</p>

<ul>
	<li><code>Infix expression:</code> The expression of the form a <code>op</code> b. When an operator is in between every pair of operands.</li>
	<li><code>Postfix expression:</code> The expression of the form a b <code>op</code>. When an operator is followed for every pair of operands.</li>
</ul>

<p>&nbsp;</p>

<p><code>Note:</code> The precedence order is as follows: (^) has the highest precedence and is evaluated from right to left, (* and /) come next with left to right associativity, and (+ and -) have the lowest precedence with left to right associativity.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> s = "a*(b+c)/d"
<strong>Output:</strong> abc+*d/
<strong>Explanation:</strong> The expression is a*(b+c)/d. First, inside the brackets, b+c becomes bc+. Now the expression looks like a*(bc+)/d. Next, multiply a with (bc+), so it becomes abc+* . Finally, divide this result by d, so it becomes abc+*d/.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> s = "a+b*c+d"
<strong>Output:</strong> abc*+d+
<strong>Explanation:</strong> The expression a+b*c+d is converted by first doing b*c -> bc*, then adding a -> abc*+, and finally adding d -> abc*+d+.
</pre>

<p>&nbsp;</p>

<pre>
<strong>Input:</strong> s = "(a+b)*(c+d)"
<strong>Output:</strong> ab+cd+*
<strong>Explanation:</strong> The expression (a+b)*(c+d) is converted by first doing (a+b) -> ab+, then doing (c+d) -> cd+, and finally the expression ab+*cd+ becomes ab+cd+*. 
</pre>


<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 5*10<sup>3</sup></code></li>
	<li><code>s[i] can be an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((, ))</code></li>

</ul>
