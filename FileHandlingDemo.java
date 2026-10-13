
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Create a file
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello! This is Java File Handling.");
            writer.close();

            // Read the file
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("File contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            br.close();
            reader.close();

            System.out.println("File closed successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
