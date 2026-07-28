//Find the row with the largest row sum
import java.util.Scanner;
public class largeRowSum {
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
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Row " + i + "=" + rowSum);
            if(rowSum>max){
                max=rowSum;
                index=i;
            }
        }
        System.out.println("Maximum sum: " + max);
        System.out.println("Row index of the row with the maximum sum: " + index);
        inp.close();
    }
}
