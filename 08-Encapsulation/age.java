//Age Validation: Private= name, age. Setter should allow: 0–120. Else print: Invalid Age

import java.util.Scanner;
public class age {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>=0 && age<=120){
            this.age=age;
        }
        else{
            System.out.println("Invalid age!");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        age a=new age();
        System.out.println("Enter name: ");
        a.setName(inp.nextLine());
        System.out.println("Enter age: ");
        a.setAge(inp.nextInt());
        System.out.println("\nDetails: ");
        System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
        inp.close();
    }
}
