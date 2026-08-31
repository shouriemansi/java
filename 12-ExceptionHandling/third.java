//Ask the user to enter a number as a String. Convert it into an integer using: Integer.parseInt() 
// Handle the exception if the user enters something like: abc or 12xyz or hello

import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=inp.next();
        try{
            int result=Integer.parseInt(str);
            System.out.println("String to number: " + result);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format!");
        }
    }
}
