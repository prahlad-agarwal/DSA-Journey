<h2><a href="https://www.geeksforgeeks.org/dsa/print-all-the-duplicates-in-the-input-string">Print all the duplicate characters in a string
</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Given a <code>string s</code>, the task is to identify all characters that appear <code>more than once</code> and print each as a <code>list</code> containing the <code>character</code> and its <code>count</code>.</p>

<p><strong class="example">Examples:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;geeksforgeeks&quot;
<strong>Output:</strong> ['e', 4], ['g', 2], ['k', 2], ['s', 2]
<strong>Explanation:</strong> Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.
</pre>

&nbsp;

<pre>
<strong>Input:</strong> s = &quot;programming&quot;
<strong>Output:</strong> ['r', 2], ['g', 2], ['m', 2]
<strong>Explanation:</strong> Only r, g, and m are duplicates. Output lists them with their counts.
</pre>

&nbsp;

<pre>
<strong>Input:</strong> s = &quot;mississippi&quot;
<strong>Output:</strong> ['i', 4], ['s', 4], ['p', 2]
<strong>Explanation:</strong> Characters i, s, and p have multiple occurrences. The output reflects that with count and order preserved.
</pre>
