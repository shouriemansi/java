//Percentage Validation. Private: marks. Setter: 0–100 only

import java.util.Scanner;
public class percent{
    private int marks;
    public void setMarks(int m){
        if(m>=0 && m<=100){
            marks=m;
        }
        else{
            System.out.println("Invalid data!");
        }
    }
    public int getMarks(){
        return marks;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        percent p=new percent();
        System.out.println("Enter marks: ");
        p.setMarks(inp.nextInt());
        System.out.println("Marks: " + p.getMarks());
        inp.close();
    }
}
