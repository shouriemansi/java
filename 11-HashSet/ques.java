
// ### 5. Find Common Elements

// Given two arrays, print the elements that are present in **both**.

// **Input:**

// ```text
// 5
// 1 2 3 4 5
// 4
// 3 4 5 6
// ```

// **Output:**

// ```text
// 3 4 5
// ```

// ---

// ### 6. Check for Duplicate

// Given an array, determine whether it contains **any duplicate**.

// **Input:**

// ```text
// 6
// 10 20 30 40 20 50
// ```

// **Output:**

// ```text
// Duplicate exists
// ```

// ---

// ## 🟡 EASY-MEDIUM

// ### 7. Find Missing Number

// You are given numbers from `1` to `n`, but one number is missing. Find it using a HashSet.

// **Input:**

// ```text
// 5
// 1 2 4 5
// ```

// **Output:**

// ```text
// 3
// ```

// ---

// ### 8. Union of Two Arrays

// Print all unique elements present in **either** of the two arrays.

// **Input:**

// ```text
// 5
// 1 2 3 4 5
// 4
// 4 5 6 7
// ```

// **Output:**

// ```text
// [1, 2, 3, 4, 5, 6, 7]
// ```

// 💡 Think about `addAll()`.

// ---

// ### 9. Intersection of Two Arrays

// Print only elements common to both arrays.

// **Input:**

// ```text
// 6
// 1 2 3 4 5 6
// 5
// 4 5 6 7 8
// ```

// **Output:**

// ```text
// 4 5 6
// ```

// 💡 Think about `retainAll()`.

// ---

// ### 10. Find First Repeated Element

// Given an array, find the **first element that gets repeated** while traversing from left to right.

// **Input:**

// ```text
// 7
// 10 20 30 40 20 50 30
// ```

// **Output:**

// ```text
// 20
// ```

// 💡 Use:

// ```java
// if (set.contains(arr[i]))
// ```

// ---

// ### 11. Find First Non-Repeating Element

// Given an array, find the first element that occurs only once.

// **Input:**

// ```text
// 7
// 4 5 1 4 5 2 1
// ```

// **Output:**

// ```text
// 2
// ```

// ⚠️ This one is slightly tricky because a HashSet alone doesn't store frequencies. You may need another data structure.

// ---

// ### 12. Check Two Arrays Have No Common Element

// Given two arrays, determine whether they have **zero common elements**.

// **Input:**

// ```text
// 4
// 1 2 3 4
// 3
// 5 6 7
// ```

// **Output:**

// ```text
// No common elements
// ```

// ---

// ## 🟠 MEDIUM

// ### 13. Pair With Given Sum

// Given an array and a target sum, determine whether there are **two numbers whose sum equals the target**.

// **Input:**

// ```text
// 6
// 10 15 3 7 8 2
// 17
// ```

// **Output:**

// ```text
// Pair exists
// ```

// 💡 Example:
// `10 + 7 = 17`

// The HashSet approach is:

// ```text
// For every number x:
//     check if target - x exists
//     if yes → pair found
//     otherwise add x
// ```

// ---

// ### 14. Longest Consecutive Sequence

// Given an unsorted array, find the length of the longest sequence of consecutive numbers.

// **Input:**

// ```text
// 6
// 100 4 200 1 3 2
// ```

// **Output:**

// ```text
// 4
// ```

// Because:

// ```text
// 1 2 3 4
// ```

// This is a **very important HashSet problem**.

// ---

// ### 15. Find Elements Appearing in Both Arrays — No Duplicates

// Given two arrays, print common elements only once, even if they occur multiple times.

// **Input:**

// ```text
// 6
// 1 2 2 3 4 4
// 5
// 2 2 4 5 6
// ```

// **Output:**

// ```text
// 2 4
// ```

// ---

// ### 16. Check if Array Contains Consecutive Numbers

// Determine whether all elements of an array form a consecutive sequence.

// **Input:**

// ```text
// 5
// 5 2 4 3 1
// ```

// **Output:**

// ```text
// Yes
// ```

// Because the numbers are:

// ```text
// 1 2 3 4 5
// ```

// Order doesn't matter.

// ---

// ### 17. Longest Subarray With Distinct Elements

// Find the length of the longest contiguous subarray containing **no repeated elements**.

// **Input:**

// ```text
// 7
// 1 2 3 1 2 3 4
// ```

// **Output:**

// ```text
// 4
// ```

// Because:

// ```text
// 1 2 3 4
// ```

// This introduces the **sliding window + HashSet** technique.

// ---

// ### 18. Find Missing Numbers

// Given an array containing numbers from `1` to `n`, where multiple numbers may be missing, find all missing numbers.

// **Input:**

// ```text
// 8
// 1 3 5 6 8
// ```

// **Output:**

// ```text
// 2 4 7
// ```

// ---

// ### 19. Common Elements Among 3 Arrays

// Given three arrays, print elements common to all three.

// **Input:**

// ```text
// 5
// 1 2 3 4 5

// 5
// 2 3 4 6 7

// 5
// 3 4 5 8 9
// ```

// **Output:**

// ```text
// 3 4
// ```

// ---

// ### 20. Find Unique Element

// Every element in an array appears **twice except one**. Find the element that appears only once.

// **Input:**

// ```text
// 7
// 2 3 5 4 5 3 2
// ```

// **Output:**

// ```text
// 4
// ```

// ---

// ## 🔥 Best order to solve

// Don't do all 20 randomly. I'd recommend:

// **Start with:**
// `1 → 2 → 3 → 6 → 4 → 5`

// Then:

// `7 → 8 → 9 → 10 → 12`

// Then the important ones:

// `13 → 14 → 16 → 18 → 17`

// If you're specifically practicing **HashSet from scratch**, do **1–6 first**, and send me your code for each one. I'll check it without giving you the solution immediately.
