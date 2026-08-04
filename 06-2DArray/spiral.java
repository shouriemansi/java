//Spirally traverse a matrix
import java.util.Scanner;
public class spiral{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=inp.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=inp.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter elements: ");
        for (int i=0; i<rows;i++) {
            for (int j=0; j<cols;j++) {
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Your entered elements: ");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int top=0;
        int right=cols-1;
        int bottom=rows-1;
        int left=0;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // ensures a bottom row still exists before printing it.
            if(top<=bottom){      
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // ensures a left column still exists before printing it.
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
        inp.close();
    }
}