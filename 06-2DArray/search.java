import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n = inp.nextInt();
        int arr[][] = new int[n][n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        System.out.println("You entered: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the element you want to search: ");
        int num = inp.nextInt();
        boolean found = false;
        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == num) {
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.print("Element found at (" + row + "," + col + ")");
        } else {
            System.out.print("Element not found");
        }
        inp.close();
    }
}
