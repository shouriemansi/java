//Find the column having the maximum element.
import java.util.Scanner;
public class maxelementCol {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=inp.nextInt();
        System.out.print("Enter number of columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Your entered elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max=arr[0][0];
        int col=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    col=j;
                }
            }
        }
        System.out.println("Column having the maximum element " + max + " is at index " + col);
    }
}
