package vista;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FitxerTXT {
	
	private static final String FILE_PATH = "output.txt";

    public static void FitxerTXT(String text) {
    	try {
            Path filePath = Paths.get(FILE_PATH);
            if (!Files.exists(filePath)) {
                Files.createFile(filePath); // Create the file if it doesn't exist
            }
            
            try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
                fileWriter.write(text + "\n"); // Append the text to the file with a newline
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}