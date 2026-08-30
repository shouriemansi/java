// ### Q7. Insert at Beginning — With User Input

//Insert at Beginning — Without Input
// **Important:** Don't create a completely new list. Modify the existing list.

// import java.util.Scanner;
// public class ques{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }  
//     public static void main(String[] args){
//         Scanner inp=new Scanner(System.in);
//         System.out.print("Enter number of nodes: ");
//         int n=inp.nextInt();
//         Node head=null;
//         for(int i=0;i<n;i++){
//             System.out.println("Enter node: ");
//             int data=inp.nextInt();
//             Node newNode=new Node(data);
//             newNode.next=head;
//             head=newNode;
//         }
//         Node temp=head;
//         System.out.println("Linked List: ");
//         while(temp!=null){
//             System.out.print(temp.data + " ");
//             temp=temp.next;
//         }
//     }
// }

// Input:  10 20 30 40
// Output: 40 30 20 10




//Insert at End — Without Input

// public class ques{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }  
//     public static void main(String[] args){
//         Node head=new Node(10);
//         head.next=new Node(20);
//         head.next.next=new Node(30);
//         head.next.next.next=new Node(40);
//         Node newNode=new Node(50);
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newNode;
//         temp=head;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
// }


//Insert at End — With Input
// Take `n` numbers from the user and create the linked list by inserting each number at the **end**.

// import java.util.Scanner;
// public class ques{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }  
//     public static void main(String[] args){
//         Scanner inp=new Scanner(System.in);
//         System.out.print("Enter number of nodes: ");
//         int n=inp.nextInt();
//         Node head=null;
//         for(int i=0;i<n;i++){
//             System.out.println("Enter node: ");
//             int data=inp.nextInt();
//             Node newNode=new Node(data);
//             if(head==null){
//                 head=newNode;
//             }
//             else{
//                 Node temp=head;
//                 while(temp.next!=null){
//                     temp = temp.next;
//                 }
//                 temp.next=newNode;
//             }
//         }
//         Node temp=head;
//         System.out.println("Linked List: ");
//         while(temp!=null){
//             System.out.print(temp.data + " ");
//             temp=temp.next;
//         }
//     }
// }

// Input: 10 20 30 40 50
// Output: 10 20 30 40 50



//Insert at a Specific Position
// Insert `30` at position `3`.
// Assume positions start from **1**.

// public class ques{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//      public static void main(String[] args){
//         Node head=new Node(10);
//         head.next=new Node(20);
//         head.next.next=new Node(40);
//         head.next.next.next=new Node(50);
//         int value=30;
//         int position=3;
//         Node newNode=new Node(value);
//         if(position==1){
//             newNode.next=head;
//             head=newNode;
//         }
//         else{
//             Node temp=head;
//             for (int i=1;i<position-1;i++){
//                 temp=temp.next;
//             }
//             newNode.next=temp.next;
//             temp.next=newNode;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data + " ");
//             temp=temp.next;
//         }
//     }
// }



//Delete First Node



//Delete Last Node



//Delete a Node at a Given Position




//Delete a Node by Value










//Count Even and Odd Nodes




//Find the Middle Node

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

//Detect a Cycle ⭐

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

