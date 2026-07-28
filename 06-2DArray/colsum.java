//Find the sum of each column
import java.util.Scanner;
public class colsum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=inp.nextInt();
        System.out.print("Enter the number of columns: ");
        int col=inp.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter numbers: ");
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
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum+=arr[i][j];
            }
            System.out.println("Coulmn " + j + "=" + sum);
        }
        inp.close();
    }
}
