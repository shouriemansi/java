//Print all the elements of the main diagonal

import java.util.Scanner;
public class maindiagonal{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=inp.nextInt();
        System.out.print("Enter number of columns: ");
        int col=inp.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        System.out.println("Your entered elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Main diagonal elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        inp.close();
    }
}
