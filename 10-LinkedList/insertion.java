//At the Beginning (without input)

// public class insertion {
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
//         Node newNode=new Node(5);
//         newNode.next=head;
//         head=newNode;
//         Node temp=head;
//         while(temp!=null){
//             System.out.println(temp);
//             temp=temp.next;
//         }
//     }    
// }


//At the Beginning (with input)

// import java.util.Scanner;
// public class insertion {
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
//         System.out.println("Enter 4 numbers: ");
//         int a=inp.nextInt();   
//         int b=inp.nextInt();
//         int c=inp.nextInt();
//         int d=inp.nextInt();
//         Node head=new Node(a);
//         head.next=new Node(b);
//         head.next.next=new Node(c);
//         head.next.next.next=new Node(d);
//         System.out.println("Enter value to insert: ");
//         int value=inp.nextInt();
//         Node newVal=new Node(value);
//         newVal.next=head;
//         head=newVal;
//         Node temp=head;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
// }
// }


//Insertion at End (Without input)

// public class insertion {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
    // public static void main(String[] args){
    //     Node head=new Node(10);
    //     head.next=new Node(20);
    //     head.next.next=new Node(30);
    //     head.next.next.next=new Node(40);
    //     Node newNode=new Node(5);
    //     Node temp=head;
    //     while(temp.next!=null){
    //         temp=temp.next;
    //     }
    //     temp.next=newNode;

    //     temp=head;
    //     while (temp!=null){
    //         System.out.println(temp.data);
    //         temp=temp.next;
    //     }
    // }    
// }


//Insertion at End (with input)

import java.util.Scanner;
public class insertion{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        System.out.print("Enter value to insert: ");
        int value=inp.nextInt();
        Node newNode=new Node(value);
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}