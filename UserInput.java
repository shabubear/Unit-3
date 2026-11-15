import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any string: ");
        String n = scanner.nextLine();
        System.out.println("--" + n + "?--");
        System.out.println("Enter any integer: ");
        int x = scanner.nextInt();
        System.out.println("Squared: ");
        System.out.println(x * x);
    }
}