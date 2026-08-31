// Print Duplicate Elements. Given an array, print the elements that occur more than once.

import java.util.*;
public class countDuplicates {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=inp.nextInt();
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int i=0;i<n;i++){
            int x=inp.nextInt();
            if(set.contains(x)){
                duplicates.add(x);
            }
            else{
                set.add(x);
            }
        }
        System.out.println("Duplicate Elements: "+ duplicates);
        System.out.println("Count: " + duplicates.size());
}
}
