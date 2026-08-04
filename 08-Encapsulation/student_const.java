//Student using Constructor: Private: name, rollNo
//Initialize through constructor. Provide getters only. No setters.

public class student_const {
    private String name;
    private int rollNo;
    student_const(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public static void main(String[] args){
        student_const s1=new student_const("abc", 101);
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNo());
    }
}
