import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate birthDate = LocalDate.parse(inputDate);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period age = Period.between(birthDate, currentDate);

        // Display the age in years, months, and days
        System.out.printf("Your age is: %d years, %d months, and %d days%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}
