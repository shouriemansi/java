import java.util.Scanner;
public class frequency {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
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
        System.out.print("Enter the number you want to count frequency for: ");
        int num=inp.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==num){
                    count++;
                }
            }
        }
        System.out.println("Number " + num + " appeared " + count + " times");
        inp.close();
    }
}
