// public class traversing {
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
//         Node temp=head;
//         while(temp!=null){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
// }



import java.util.Scanner;
public class traversing{
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
        System.out.print("Enter 4 numbers: ");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        int d=inp.nextInt();
        Node head=new Node(a);
        head.next=new Node(b);
        head.next.next=new Node(c);
        head.next.next.next=new Node(d);
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
