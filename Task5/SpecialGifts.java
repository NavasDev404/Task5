import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGifts {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Amanda");
        studentNames.add("John");
        studentNames.add("Ava");
        studentNames.add("Sophia");
        studentNames.add("Aaron");
        studentNames.add("Michael");
        studentNames.add("Andrew");
        studentNames.add("Emily");

        // Filter names that start with "A" using Stream and lambda expression
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A")) // Check if the name starts with "A"
                .collect(Collectors.toList()); // Collect the filtered names into a List

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}
