import java.util.Scanner;

public class DovePhotography {
    public static void main(String[] args) {
        // Write your code below!
        System.out.print("family: ");
        Scanner scanner = new Scanner(System.in);
        String family = scanner.nextLine();
        System.out.print("feather color: ");
        String featherColor = scanner.nextLine();
        System.out.print("eye color: ");
        String eyeColor = scanner.nextLine();

        if (family.toLowerCase().equals("columbidae")) {
            if (featherColor.toLowerCase().equals("orange") && eyeColor.toLowerCase().equals("blue")) {
                System.out.print("Cooler dove!! Take many pictures!!");
            }
        } else {
            System.out.print("Meh bird... let's find a different one.");

        }
    }
}
