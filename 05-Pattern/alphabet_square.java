import java.util.Scanner;
public class alphabet_square{
    void sqr(int rows){
        for(int i=1;i<=rows;i++){
            char ch='A';
            for(int j=1;j<=rows;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=inp.nextInt();
        alphabet_square obj=new alphabet_square();
        obj.sqr(rows);
    }
}
