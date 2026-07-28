public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting (Widening)
        int number=25;
        double doubleNumber=number;

        System.out.println("Implicit Casting:");
        System.out.println("int value = " + number);
        System.out.println("Converted to double = " + doubleNumber);

        System.out.println();


        // Explicit Casting (Narrowing)
        double price=99.99;
        int intPrice=(int) price;

        System.out.println("Explicit Casting:");
        System.out.println("double value = " + price);
        System.out.println("Converted to int = " + intPrice);

    }
}