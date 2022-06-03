package T09StreamsFilesAndDirectories.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class E05LineNumbers {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("src/T09StreamsFilesAndDirectories/exercise/output.txt")) {
            Path inputFile = Paths.get("src/T09StreamsFilesAndDirectories/exercise/inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                pw.println((i + 1) + ". " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
