// Remove Duplicates: Take `n` integers from the user and print only the **unique numbers**.

import java.util.*;
public class removeDuplicate{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=inp.nextInt();
        HashSet<Integer> nums= new HashSet<>();
        for(int i=0;i<n;i++){
            int x=inp.nextInt();
            nums.add(x);
        }        
        System.out.println(nums);

    }
}