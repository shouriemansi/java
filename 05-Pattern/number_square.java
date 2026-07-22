import java.util.Scanner;
public class number_square{
    void sqr(int rows){
        for(int i=0;i<rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=inp.nextInt();
        number_square obj=new number_square();
        obj.sqr(rows);
    }
}
