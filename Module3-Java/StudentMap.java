// StudentMap.java
import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student ID and name (type ID -1 to stop):");

        while (true) {
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();  // consume newline
            if (id == -1) break;

            System.out.print("Name: ");
            String name = input.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = input.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }

        input.close();
    }
}