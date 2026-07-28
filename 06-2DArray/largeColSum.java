//Find the column with the largest row sum
import java.util.Scanner;
public class largeColSum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements: ");
        for(int  i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("You entered: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int j=0;j<n;j++){
            int colSum=0;
            for(int i=0;i<n;i++){
                colSum+=arr[i][j];
            }
            System.out.println("Column " + j + "=" + colSum);
            if(colSum>max){
                max=colSum;
                index=j;
            }
        }
        System.out.println("Maximum sum: " + max);
        System.out.println("Column index of the column with the maximum sum: " + index);
        inp.close();
    }
}
