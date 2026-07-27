//Find the average of the elements
import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=inp.nextInt();
        System.out.print("Enter number of columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter elements: ");
        for (int i=0; i<m;i++) {
            for (int j=0; j<n;j++) {
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Your entered elements: ");
        int sum=0;
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        int count=m*n;
        double avg= (double) sum/count;
        System.out.println("Average: " + avg);
        inp.close();
    }
}
