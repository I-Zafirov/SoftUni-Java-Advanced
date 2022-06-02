package T09StreamsFilesAndDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class L05WriteEveryThirdLine2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        List<String> strings = Files.readAllLines(Paths.get(path));

        for (int i = 2; i < strings.size(); i += 3) {
            System.out.println(strings.get(i));
        }
    }
}