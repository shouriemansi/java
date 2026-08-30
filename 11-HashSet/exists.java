// Check if Element Exists. Take `n` integers, store them in a `HashSet`, then take another integer and check whether it exists.

import java.util.*;
public class exists {
     public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=inp.nextInt();
        HashSet<Integer> nums= new HashSet<>();
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++){
            int x=inp.nextInt();
            nums.add(x);
        }
        System.out.println("Enter the element you want to search for: ");
        int element=inp.nextInt();
        boolean found=nums.contains(element);
        if(found){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
