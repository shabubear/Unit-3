import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Current grade (percentage):");
        Scanner scanner = new Scanner(System.in);
        double current = scanner.nextDouble();
        System.out.println("Final weight (percentage):");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Target grade (letter):");
        String target = scanner.nextLine();
        int targetGrade = 100;

        switch (target.toLowerCase()) {
            case "a":
                targetGrade = 90;
                break;
            case "b":
                targetGrade = 80;
                break;
            case "c":
                targetGrade = 70;
                break;
            case "d":
                targetGrade = 60;
                break;
            default:
                System.out.println("Invalid grade (enter any grade from D to A)");
                System.out.println("Target grade now defaulted to A");
                targetGrade = 90;
        }

        double minpercent = current + 100 * (targetGrade - current) / weight;
        String minletter = "A";
        if (minpercent >= 90)
            minletter = "A";
        if (minpercent >= 80 && minpercent < 90)
            minletter = "B";
        if (minpercent >= 70 && minpercent < 80)
            minletter = "C";
        if (minpercent >= 60 && minpercent < 70)
            minletter = "D";
        if (minpercent < 60)
            minletter = "F";

        System.out.print("Final minimum percentage needed: " + minpercent + " (" + (minletter) + ")");

    }
}
