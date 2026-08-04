//Print all the boundary elements
import java.util.Scanner;
public class boundary{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Your entered elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Boundary elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        inp.close();
    }
}