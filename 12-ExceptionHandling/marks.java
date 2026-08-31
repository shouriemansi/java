//Create a method: static void validateMarks(int marks)
//Rules: marks < 0       → invalid 
// marks > 100     → invalid
// 0–100           → valid
// Create: InvalidMarksException and use it to handle invalid marks.

import java.util.*;
class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
public class marks {
    static void validateMarks(int marks) throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Marks should be betwwen 0 to 100!");
        }
        System.out.println("Valid marks!");
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=inp.nextInt();
        try{
            validateMarks(marks);
        }
        catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }
        inp.close();
    }
}