import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "sample.txt";

        // Write to the file using FileWriter
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, FileWriter!\nThis is a test.");
            writer.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Read from the file using FileReader
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            System.out.println("Contents of the file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
