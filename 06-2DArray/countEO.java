//Count the total number of even and odd occurances.
import java.util.Scanner;
public class countEO {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int num=inp.nextInt();
        int arr[][]=new int[num][num];
        System.out.println("Enter elements: ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("You entered: ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i][j]%2==0){
                    even_count++;
                }
                else{
                    odd_count++;
                }
            }
        }
        System.out.println("Number of even elements are " +  even_count);
        System.out.println("Number of odd elements are " + odd_count);
    }
}
