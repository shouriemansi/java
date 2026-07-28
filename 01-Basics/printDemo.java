public class printDemo{
    public static void main(String[] args){

        // Using println()
        System.out.println("Using println():");
        System.out.println("Name: Shyam");
        System.out.println("Age: 18");
        System.out.println("CGPA: 9.2");

        System.out.println();

        // Using print()
        System.out.print("Using print(): ");
        System.out.print("Name: Shyam, ");
        System.out.print("Age: 18, ");
        System.out.print("CGPA: 9.2");

        System.out.println();
        System.out.println();

        // Using printf()
        System.out.println("Using printf():");
        System.out.printf("Name: %s%n", "Shyam");
        System.out.printf("Age: %d%n", 18);
        System.out.printf("CGPA: %.1f%n", 9.2);

    }
}
