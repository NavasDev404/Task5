import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        // Initialize the list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings using Stream API
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty()) // Keep only non-empty strings
                .collect(Collectors.toList()); // Collect results into a List

        // Print the list of non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
