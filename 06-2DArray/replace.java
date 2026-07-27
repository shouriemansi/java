//Replace all the negative occurances with 0.
import java.util.Scanner;
public class replace {
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
        System.out.println("You entered: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<0){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("Replaced: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
