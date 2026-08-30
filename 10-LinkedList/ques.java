
// ### Q3. Find the Sum

// Given:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// Find and print the sum of all nodes.

// **Expected output:**

// ```text
// Sum = 100
// ```

// **Concept:** Traversal + accessing `temp.data`.

// ---

// ### Q4. Find the Maximum

// Given:

// ```text
// 15 → 7 → 25 → 10 → 3 → null
// ```

// Find the largest value.

// **Expected output:**

// ```text
// Maximum = 25
// ```

// **Concept:** Traversal + comparison.

// ---

// ### Q5. Search for an Element

// Given:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// Search for `30`.

// Print:

// ```text
// Element found
// ```

// If the element doesn't exist, print:

// ```text
// Element not found
// ```

// **Concept:** Traversal + condition.

// ---

// # 🟡 Level 2 — Insertion

// Now things get interesting.

// ### Q6. Insert at Beginning — Without Input

// Given:

// ```text
// 20 → 30 → 40 → null
// ```

// Insert `10` at the beginning.

// Final list:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// **Important:** Don't create a completely new list. Modify the existing list.

// **Concept you should understand:**

// ```java
// newNode.next = head;
// head = newNode;
// ```

// ---

// ### Q7. Insert at Beginning — With User Input

// Take `n` values from the user and create a linked list by **inserting every new value at the beginning**.

// For input:

// ```text
// 4
// 10 20 30 40
// ```

// Output should be:

// ```text
// 40 30 20 10
// ```

// 🔥 This is important because it makes you understand **why insertion at beginning reverses the order**.

// ---

// ### Q8. Insert at End — Without Input

// Given:

// ```text
// 10 → 20 → 30 → null
// ```

// Insert `40` at the end.

// Final:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// **Concept:** Traverse until:

// ```java
// temp.next == null
// ```

// Then connect the new node.

// ---

// ### Q9. Insert at End — With Input

// Take `n` numbers from the user and create the linked list by inserting each number at the **end**.

// Input:

// ```text
// 5
// 10 20 30 40 50
// ```

// Output:

// ```text
// 10 20 30 40 50
// ```

// Compare this with Q7.

// You should be able to explain **why Q7 reverses the order but Q9 doesn't.**

// ---

// ### Q10. Insert at a Specific Position

// Given:

// ```text
// 10 → 20 → 40 → 50 → null
// ```

// Insert `30` at position `3`.

// Final:

// ```text
// 10 → 20 → 30 → 40 → 50 → null
// ```

// Assume positions start from **1**.

// Test yourself with:

// ```text
// Position = 1
// Position = 3
// Position = 5
// ```

// Think carefully about what happens when inserting at position `1`.

// ---

// # 🟡 Level 3 — Deletion

// ### Q11. Delete First Node

// Given:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// Delete the first node.

// Expected:

// ```text
// 20 → 30 → 40 → null
// ```

// You should figure out why:

// ```java
// head = head.next;
// ```

// works.

// ---

// ### Q12. Delete Last Node

// Given:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// Delete `40`.

// Expected:

// ```text
// 10 → 20 → 30 → null
// ```

// **Hint:** You need to reach the node **before** the last node.

// Think about what condition you need:

// ```java
// temp.next.next == null
// ```

// ---

// ### Q13. Delete a Node at a Given Position

// Given:

// ```text
// 10 → 20 → 30 → 40 → 50
// ```

// Delete the node at position `3`.

// Expected:

// ```text
// 10 → 20 → 40 → 50
// ```

// Try positions:

// ```text
// 1
// 3
// 5
// ```

// This is a very important exam-type question.

// ---

// ### Q14. Delete a Node by Value

// Given:

// ```text
// 10 → 20 → 30 → 40 → 50
// ```

// Delete the node containing `30`.

// Expected:

// ```text
// 10 → 20 → 40 → 50
// ```

// Then test:

// ```text
// Delete 10
// Delete 50
// Delete 100
// ```

// This forces you to handle different cases.

// ---

// # 🟠 Level 4 — Slightly More Thinking

// ### Q15. Count Even and Odd Nodes

// Given:

// ```text
// 10 → 15 → 20 → 25 → 30 → null
// ```

// Print:

// ```text
// Even = 3
// Odd = 2
// ```

// ---

// ### Q16. Find the Middle Node

// Given:

// ```text
// 10 → 20 → 30 → 40 → 50
// ```

// Print:

// ```text
// Middle = 30
// ```

// Then try:

// ```text
// 10 → 20 → 30 → 40
// ```

// Decide what your program should print for an even number of nodes.

// **Hint:** Later you'll learn the **slow and fast pointer** technique for this.

// ---

// ### Q17. Reverse a Linked List ⭐

// Given:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// Reverse it.

// Expected:

// ```text
// 40 → 30 → 20 → 10 → null
// ```

// This is one of the **most important Linked List problems**.

// Don't use another linked list.

// You should eventually understand these three variables:

// ```java
// prev
// current
// next
// ```

// ---

// ### Q18. Find the nth Node from the Beginning

// Given:

// ```text
// 10 → 20 → 30 → 40 → 50
// ```

// If:

// ```text
// n = 3
// ```

// Output:

// ```text
// 30
// ```

// If:

// ```text
// n = 5
// ```

// Output:

// ```text
// 50
// ```

// ---

// ### Q19. Find the nth Node from the End

// Given:

// ```text
// 10 → 20 → 30 → 40 → 50
// ```

// If:

// ```text
// n = 2
// ```

// Output:

// ```text
// 40
// ```

// This is a good introduction to the **two-pointer technique**.

// ---

// # 🔴 Level 5 — Medium

// ### Q20. Remove Duplicate Values

// Given:

// ```text
// 10 → 20 → 10 → 30 → 20 → 40
// ```

// Remove duplicates.

// Expected:

// ```text
// 10 → 20 → 30 → 40
// ```

// Try solving it first without using `HashSet`.

// ---

// ### Q21. Find Whether an Element Exists

// Given:

// ```text
// 5 → 15 → 25 → 35 → 45
// ```

// Take a value from the user and search for it.

// But instead of simply saying found/not found, print its **position**.

// Input:

// ```text
// 25
// ```

// Output:

// ```text
// Element found at position 3
// ```

// ---

// ### Q22. Find the Second Largest Element

// Given:

// ```text
// 10 → 50 → 20 → 40 → 30
// ```

// Output:

// ```text
// Second largest = 40
// ```

// Try doing it with **one traversal**.

// ---

// ### Q23. Compare Two Linked Lists

// List 1:

// ```text
// 10 → 20 → 30
// ```

// List 2:

// ```text
// 10 → 20 → 30
// ```

// Print:

// ```text
// Lists are equal
// ```

// But:

// ```text
// 10 → 20 → 30
// 10 → 20 → 40
// ```

// should print:

// ```text
// Lists are not equal
// ```

// ---

// ### Q24. Merge Two Sorted Linked Lists ⭐

// Given:

// ```text
// List 1: 10 → 30 → 50
// List 2: 20 → 40 → 60
// ```

// Merge them into:

// ```text
// 10 → 20 → 30 → 40 → 50 → 60
// ```

// This is a proper **medium-level Linked List problem**.

// ---

// ### Q25. Detect a Cycle ⭐

// Normally:

// ```text
// 10 → 20 → 30 → 40 → null
// ```

// But suppose:

// ```text
// 10 → 20 → 30 → 40
//           ↑         |
//           └─────────┘
// ```

// There is a cycle.

// Write a program to determine:

// ```text
// Cycle exists
// ```

// or

// ```text
// No cycle
// ```

// This introduces **Floyd's slow/fast pointer algorithm**.

// ---

// # 🧠 Your Exam Practice Order

// Don't solve these randomly. Do them in this order:

// ### Day 1 — Fundamentals

// **Q1 → Q2 → Q3 → Q4 → Q5**

// You should become comfortable with:

// ```java
// Node
// head
// temp
// temp.data
// temp.next
// temp = temp.next
// ```

// ### Day 2 — Insertion

// **Q6 → Q7 → Q8 → Q9 → Q10**

// You should be able to write:

// ```java
// insertAtBeginning()
// insertAtEnd()
// insertAtPosition()
// ```

// without looking at notes.

// ### Day 3 — Deletion

// **Q11 → Q12 → Q13 → Q14**

// Especially understand the difference between:

// ```java
// head = head.next;
// ```

// and

// ```java
// temp.next = temp.next.next;
// ```

// ### Day 4 — Exam-level

// **Q15 → Q16 → Q17 → Q18 → Q19**

// ⭐ **Q17 (reverse)** is a must-do.

// ### Then Medium

// **Q20 → Q21 → Q22 → Q23 → Q24 → Q25**

// ---

