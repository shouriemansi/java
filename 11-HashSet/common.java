//Find Common Elements. Given two arrays, print the elements that are present in **both**.

import java.util.*;
public class common {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number for set1: ");
        int n1=inp.nextInt();
        System.out.println("Enter the number for set2: ");
        int n2=inp.nextInt();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<n1;i++){
            int x1=inp.nextInt();
            set1.add(x1);
        }
        for(int i=0;i<n2;i++){
            int x2=inp.nextInt();
            set2.add(x2);
        }
        System.out.println("Initial SET 1: " + set1);
        System.out.println("Initial SET 2: " + set2);
        set1.retainAll(set2);
        System.out.println("Common: " + set1);
    }
}
