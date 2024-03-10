package Day20;

import java.util.Scanner;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input and convert to lower case
        System.out.print("Enter text to convert to title case: ");
        String inputText = scanner.nextLine().toLowerCase();

        // Convert to title case
        String titleCaseText = convertToTitleCase(inputText);

        // Display the result
        System.out.println("Title Case: " + titleCaseText);

        // Close the scanner
        scanner.close();
    }

    // Helper method to convert text to title case
    private static String convertToTitleCase(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : text.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }
}
