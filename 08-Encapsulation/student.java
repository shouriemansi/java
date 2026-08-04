//Create a class Student having: private rollNo and name

public class student {
    private int rollNo;
    private String name;
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        student s1=new student();
        s1.setRollNo(121);
        s1.setName("abc");
        System.out.println("Roll Number: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
    }
}
