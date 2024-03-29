import java.util.Scanner;

public class MinorNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read N
        int n = scanner.nextInt();

        // Initialize minorNumber with the first number
        int minorNumber = scanner.nextInt();

        // Read the remaining N-1 numbers
        for (int i = 1; i < n; i++) {
            int number = scanner.nextInt();

            // Update minorNumber if the current number is smaller
            if (number < minorNumber) {
                minorNumber = number;
            }
        }

        // Print the minorNumber
        System.out.println(minorNumber);
    }
}

