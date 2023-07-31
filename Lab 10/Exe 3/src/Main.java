import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);

            // Read the file content (This won't be executed if FileNotFoundException occurs)
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist or could not be found.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        }
    }
}
