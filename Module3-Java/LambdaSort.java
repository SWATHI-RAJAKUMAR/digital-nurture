// LambdaSort.java
import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoe", "Alice", "John", "Bob");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}