import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UC11 {

    public static void main(String[] args) {
        System.out.println("=== UC11: Validate Train ID & Cargo Codes ===");

        Scanner scanner = new Scanner(System.in);

        // Prompt user for Train ID
        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainID = scanner.nextLine();

        // Prompt user for Cargo Code
        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainIDPattern = "TRN-\\d{4}";        // TRN-1234
        String cargoCodePattern = "PET-[A-Z]{2}";    // PET-AB

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIDPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format!");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format!");
        }

        System.out.println("\nUC11 execution completed.");
        scanner.close();
    }
}