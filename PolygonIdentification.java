import java.util.Scanner;

public class PolygonIdentification {
    public static void main(String[] args) {
        // Write your code below!
        System.out.println("Type the number of sides:");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();

        switch (sides) {
            case 3:
                System.out.print("triangle");
                break;
            case 4:
                System.out.print("quadrilateral");
                break;
            case 5:
                System.out.print("pentagon");
                break;
            case 6:
                System.out.print("hexagon");
                break;
            default:
                System.out.print("figure it out yourself >:(");

        }
    }
}
