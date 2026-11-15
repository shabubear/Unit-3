import java.util.Scanner;

public class FossilClassification {
    public static void main(String[] args) {
        // Write your code below!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fossil Age (mya):");
        int age = scanner.nextInt();

        if (252 >= age && age >= 202) {
            System.out.println("This fossil is from the Triassic period");
        } else if (201 >= age && age >= 145) {
            System.out.println("This fossil is from the Jurassic period");
        } else if (144 >= age && age >= 66) {
            System.out.println("This fossil is from the Cretacous period");
        } else {
            System.out.println("._.");
        }

    }
}
