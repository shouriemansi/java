//Calculate sum of all the elements
import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int num=inp.nextInt();
        int arr[][]=new int[num][num];
        System.out.println("Enter elements : ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        int sumOfElements=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                sumOfElements+=arr[i][j];
            }
        }
        System.out.println("Your entered elements: ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum: " +  sumOfElements);
    }
}
