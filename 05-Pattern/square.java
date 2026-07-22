import java.util.Scanner;
public class square{
    void sqr(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=inp.nextInt();
        square obj=new square();
        obj.sqr(rows);
    }
}
