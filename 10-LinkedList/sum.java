//Find the Sum of all the nodes

public class sum {
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
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        int sum=0;
        Node temp=head;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println("Sum of nodes: " + sum);
    }
}
