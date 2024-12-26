import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUppercase {
    public static void main(String[] args) {
        // Create a Stream of strings
        Stream<String> namesStream = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using map() and collect the results into a List
        List<String> uppercaseNames = namesStream
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect results into a List

        // Print the resulting list
        System.out.println(uppercaseNames);
    }
}
