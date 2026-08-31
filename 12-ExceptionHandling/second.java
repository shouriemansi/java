//Create an integer array of 5 elements. Ask the user for an index and print the element at that index. Handle the situation when the user enters an invalid index.

import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=inp.nextInt();
        System.out.print("Enter array elements: ");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }
        System.out.println("Enter the index: ");
        int index=inp.nextInt();
        try{
            System.out.println("Element: " + arr[index]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bound!");
        }
    }
}
