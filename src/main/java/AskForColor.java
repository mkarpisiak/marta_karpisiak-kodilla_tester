import java.util.Scanner;

public class AskForColor {

        public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of colour (G- green, Y-yellow, B- blue, P-pink, W-white:");
            String colour = scanner.nextLine().trim();
            switch (colour) {
                case "G":
                    return "green";
                case "Y":
                    return "yellow";
                case "B":
                    return "blue";
                case "P":
                    return "pink";
                case "W":
                    return "white";
                default:
                    System.out.println("Wrong choice. Choose another letter.");
            }

        }
    }

    public static void main(String[] args) {
            AskForColor askForColor= new AskForColor();
            askForColor.getFirstLetter();


    }
}