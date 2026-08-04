//Car Private: company, model, mileage. Display all details using getters.

import java.util.Scanner;
public class car{
    private String company;
    private String model;
    private int mileage;
    public void setCompany(String company){
        this.company=company;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setMileage(int mileage){
        this.mileage=mileage;
    }
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getMileage(){
        return mileage;
    }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter company name: ");
        String comp=inp.nextLine();
        System.out.println("Enter model name: ");
        String name=inp.nextLine();
        System.out.println("Enter mileage: ");
        int mileage=inp.nextInt();
        car c=new car();
        c.setCompany(comp);
        c.setModel(name);
        c.setMileage(mileage);
        System.out.println("Company name and model: " + c.getCompany() + " " + c.getModel());
        System.out.println("Mileage: " + c.getMileage());
    }
}
