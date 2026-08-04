// Create an Employee class having: id, name, salary. All variables should be private.

public class employee {
    private int id;
    private String name;
    private double salary;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args){
        employee emp=new employee();
        emp.setId(101);
        emp.setName("abc");
        emp.setSalary(10000.50);
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Employee id: " + emp.getId());
        System.out.println("Employee salary: " + emp.getSalary());        
    }
}
