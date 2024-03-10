package Day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {

        // isDigit()
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the amount to transfer: ");

        try {
            // Read the input as a double
            double amount = scanner.nextDouble();

            // Check if the input is a valid double
            if (isValidDouble(amount)) {
                // Calculate transfer fee (assuming 2% fee for demonstration)
                double transferFee = amount * 0.02;
                double totalAmount = amount + transferFee;

                // Display results
                System.out.println("Transfer Fee: Tl " + transferFee);
                System.out.println("Total Amount with Transfer Fee: Tl " + totalAmount);
            } else {
                System.out.println("Please enter a valid numerical value.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid numerical value.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Helper method to check if a double is valid
    private static boolean isValidDouble(double value) {
        return !Double.isInfinite(value) && !Double.isNaN(value);

    }
}
