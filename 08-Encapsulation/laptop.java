//Private= brand, RAM, SSD
//Constructor. Getter. Display details.

public class laptop {
    private String brand;
    private int RAM;
    private int ssd;
    laptop(String brand, int RAM, int ssd){
        this.brand=brand;
        this.RAM=RAM;
        this.ssd=ssd;
    }
    public String getBrand(){
        return brand;
    }
    public int getRAM(){
        return RAM;
    }
    public int getSSD(){
        return ssd;
    }
    public static void main(String[] args){
        laptop l1=new laptop("Dell",16, 512);
        System.out.println("Brand = " + l1.getBrand());
        System.out.println("RAM = " + l1.getRAM() + " GB");
        System.out.println("SSD = " + l1.getSSD() + " GB");
    }
}
