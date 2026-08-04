//Print matrix in wave form

import java.util.Scanner;
public class wave {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=inp.nextInt();
        System.out.print("Enter number of columns: ");
        int col=inp.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter elemnts: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("You entered: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("WAVE PATTERN: ");
        for(int j=0;j<col;j++){
            if(j%2==0){
                for(int i=0;i<row;i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int i=row-1;i>=0;i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        inp.close();
    }
}
