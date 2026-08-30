//Search for an element, print found if present, otherwise not found
import java.util.Scanner;
public class search{
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
        System.out.println("Enter the element you want to search: ");
        Scanner inp=new Scanner(System.in);
        int element=inp.nextInt();
        int pos=1;
        int currentPos=1;
        boolean found=false;     
        Node temp=head;
        while(temp!=null){
            if(temp.data==element){
                found=true;
                pos=currentPos;
                break;
            }
            temp=temp.next;
            currentPos++;
        }
        if(found){
            System.out.println("Element found at " + pos);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}