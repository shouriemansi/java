//Find the sum of each row
import java.util.Scanner;
public class rowsum {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++){
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
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Row " + i + "=" + rowSum);
        }
        inp.close();
    }
}
