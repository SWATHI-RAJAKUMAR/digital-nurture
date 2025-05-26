// FileWriterExample.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a message to write to file: ");
        String message = input.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(message);
            writer.close();
            System.out.println("Message written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        input.close();
    }
}