import java.util.Scanner;
public class Reverse{
    String input(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=inp.nextLine();
        return str;
    }
    String reverse(String str){
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Reverse obj=new Reverse();
        String str=obj.input();
        String result=obj.reverse(str);
        System.out.println("Reverse: " + result);
    }
}