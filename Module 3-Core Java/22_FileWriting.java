import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String data = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data);
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
