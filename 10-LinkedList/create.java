// 1. Separate references

// public class create {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args){
//         Node first=new Node(10);
//         Node second=new Node(20);
//         Node third=new Node(30);
//         first.next=second;
//         second.next=third;

        // first → reference to the Node object
        // first.data → the data stored inside that Node
        // first.next → the reference to the next Node
        
        // System.out.println(first.data); //value of first node
        // System.out.println(first.next.data);  //value of second node
        // System.out.println(first.next.next.data);   //value of third node
        
        // System.out.println(first.data);
        // System.out.println(second.data);
        // System.out.println(third.data);

        // System.out.println(first);
        // System.out.println(second);
        // System.out.println(third);

        //System.out.println(first.next);
        //System.out.println(second.next);
        //System.out.println(third.next);   //prints null(because it is tail)
    // }
// }


// 2. Using only head

// public class create{
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
//         System.out.println(head.data);
//         System.out.println(head.next.next.data);
//         System.out.println(head.next.next.data);
//     }
// }


// 3. Using a temporary reference

// public class create{
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
//         Node temp=head;
//         temp.next=new Node(20);
//         temp=temp.next;
//         temp.next=new Node(30);
//         System.out.println(head.data);
//         System.out.println(head.next.data);
//         System.out.println(head.next.next.data);
//     }
// }


// 4. Using a separate createList() method

// public class create{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static Node createList(){
//         Node head=new Node(10);
//         head.next=new Node(20);
//         head.next.next=new Node(30);
//         return head;
//     }
//     public static void main(String[] args){
//         Node head=createList();
//         System.out.println(head.data);
//         System.out.println(head.next.data);
//         System.out.println(head.next.next.data);
//     }
// }
