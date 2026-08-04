//Print one row only which the user enters
import java.util.Scanner;
public class onerow {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=inp.nextInt();
        System.out.print("Enter the number of columns: ");
        int col=inp.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("You entered: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the row number you want to print: ");
        int rowNum=inp.nextInt();
        if(rowNum>=0 && rowNum<row){
            for(int j=0;j<col;j++){
                System.out.print(arr[rowNum][j] + " ");
            }
        }
        else{
            System.out.println("Invalid row number!");
        }
        inp.close();
    }
}
