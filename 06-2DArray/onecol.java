//Print the elements of the column that the user enters
import java.util.Scanner;
public class onecol {
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
        System.out.println("Enter the column number you want to print: ");
        int colNum=inp.nextInt();
        if(colNum>=0 && colNum<col){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][colNum] + " ");
            }
        }
        else{
            System.out.println("Invalid row number!");
        }
        inp.close();
    }
}
