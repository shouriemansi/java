import java.util.Scanner;

public class countEvenOdd {
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
        int Ecount=0;
        int Ocount=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                Ecount++;
            }
            else{
                Ocount++;
            }
            temp=temp.next;
        }
        System.out.println("Number of even nodes: " + Ecount);
        System.out.println("Number of odd nodes: " + Ocount);
    }
}
