import java.util.Scanner;

public class Pyramids {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base width of the pyramid
        System.out.print("Enter the base width of the pyramid (must be an odd positive integer): ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0 || n % 2 == 0) {
            System.out.println("Invalid input! Please enter a positive odd integer.");
            return; // Exit the program if input is invalid
        }

        // Calculate the number of rows
        int k = (n + 1) / 2;
        System.out.println(k);
        // Loop to print the pyramid
        for (int i = 1; i <= k; i++) {
            // Print leading spaces
            for (int j = 1; j <= k - i; j++) {
                System.out.print(k);
            }

            // Print blocks (asterisks)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println(k);
        }

        // Close the scanner
        scanner.close();
    }
}