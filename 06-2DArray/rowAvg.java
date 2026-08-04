//Clculate average of  each row
import java.util.Scanner;
public class rowAvg {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elememts: ");
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
            int sum=0;
            double avg=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            avg=(double)sum/n;
            System.out.println("Average of row "+i+" is "+avg);
        }
        inp.close();
    }
}
