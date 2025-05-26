// StudentList.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student names (type 'done' to finish):");

        while (true) {
            String name = input.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            students.add(name);
        }

        System.out.println("Students:");
        for (String student : students) {
            System.out.println(student);
        }

        input.close();
    }
}