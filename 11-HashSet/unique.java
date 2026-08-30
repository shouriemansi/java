//Count Unique Elements. Take an array and find how many **different elements** it contains.

import java.util.* ; 
public class unique {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=inp.nextInt();
        HashSet<Integer> nums= new HashSet<>();
        for(int i=0;i<n;i++){
            int x=inp.nextInt();
            nums.add(x);
        }        
        System.out.println("Number of unique elements: " + nums.size());
    }
}
