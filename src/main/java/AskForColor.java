import java.util.Scanner;

public class AskForColor {

    static String green = "green";
    static String yellow = "yellow";
    static String blue = "blue";
    static String pink = "pink";
    static String white = "white";


    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of colour (G- green, Y-yellow, B- blue, P-pink, W-white:");
            String colour = scanner.nextLine().trim();
            switch (colour) {
                case "G":
                    return "green";
                    break;
                case "Y":
                    return "yellow";
                    break;
                case "B":
                    return "blue";
                    break;
                case "P":
                    return "pink";
                    break;
                case "W":
                    return "white";
                    break;
                default:
                    System.out.println("Wrong choise. Choose another letter.");
            }

        }
    }

    public static void main(String[] args) {

    }
}