//Count the number of positive, negative and zero numbers
import java.util.Scanner;
public class count {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements: ");
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
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(arr[i][j]>0){
                positive++;
            }
            else if(arr[i][j]<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        }
        System.out.println("POSITIVE NUMBERS: " + positive);
        System.out.println("NEGATIVE NUMBERS: " + negative);
        System.out.println("ZERO NUMBERS: " + zero);
        inp.close();
    }
}
