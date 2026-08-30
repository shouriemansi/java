// public class max {
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
//         head.next=new Node(40);
//         head.next.next=new Node(30);
//         head.next.next.next=new Node(50);
//         head.next.next.next.next=new Node(20);
//         Node temp=head;
//         int max=head.data;
//         while(temp!=null){
//             if(temp.data>max){
//                 max=temp.data;
//             }
//             temp=temp.next;
//         }
//         System.out.println("Maximum node: " + max);
//     }
// }



//With position: 

public class max {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }    
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(40);
        head.next.next=new Node(30);
        head.next.next.next=new Node(50);
        head.next.next.next.next=new Node(20);
        Node temp=head;
        int max=head.data;
        int position = 1;
        int currentPosition = 1;
        while(temp!=null){
            if(temp.data>max){
                max=temp.data;
                position= currentPosition;
            }
            temp=temp.next;
            currentPosition++;
        }
        System.out.println("Maximum node: " + max + "at position " + position);
    }
}
