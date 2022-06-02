package T09StreamsFilesAndDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class L06SortLines {
    public static void main(String[] args) throws IOException {
        {
            Path inPath = Paths.get("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt");
            Path outputPath = Paths.get("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\sorted-lines-out.txt");

            List<String> lineInFile = Files.readAllLines(inPath);
            Collections.sort(lineInFile);
            Files.write(outputPath, lineInFile);
        }
//        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";
//
//        List<String> sortedLines = Files.readAllLines(Paths.get(path))
//                .stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        Path outputPath = Path.of("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\sorted-lines-out.txt");
//
//        Files.createFile(outputPath);
//
//        Files.write(outputPath, sortedLines, StandardOpenOption.WRITE);

    }
}
