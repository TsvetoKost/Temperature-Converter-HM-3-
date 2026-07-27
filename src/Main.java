import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("Version 1.0.");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Start Converter");
            System.out.println("2 - Exit");

            int choice = readChoice(scan);
            if (choice == 1) {
                double value = readValue(scan);
                System.out.printf("Result: %.2f °C%n", (value - 32) * 5 / 9);
            } else {
                System.out.println("Goodbye!");
                scan.close();
                break;
            }
        }
    }

    private static int readChoice(Scanner scan) {
        while (true) {
            System.out.print("Choose option: ");
            if (scan.hasNextInt()) {
                int choice = scan.nextInt();
                if (choice == 1 || choice == 2) {
                    return choice;
                }
                System.out.println("Wrong choice. Enter 1 or 2.");
            } else {
                System.out.println("Please enter a number.");
                scan.next();
            }
        }
    }

    private static double readValue(Scanner scan) {
        while (true) {
            System.out.print("Fahrenheit: ");
            if (scan.hasNextDouble()) {
                double value = scan.nextDouble();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Value cannot be negative.");
            } else {
                System.out.println("Please enter a number.");
                scan.next();
            }
        }
    }
}
