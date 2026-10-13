import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class StreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("sample.txt");

            String data = "Hello Java";
            out.write(data.getBytes());
            out.close();

            System.out.println("Data written successfully.");

            FileInputStream in = new FileInputStream("sample.txt");

            int ch;

            System.out.println("File contents:");

            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }

            in.close();

            System.out.println();
            System.out.println("File closed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
