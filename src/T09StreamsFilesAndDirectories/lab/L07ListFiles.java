package T09StreamsFilesAndDirectories.lab;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class L07ListFiles {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        File root = new File("C:\\Users\\ivoom\\DATA\\IT\\SoftUni\\Java Advanced - май 2022\\" +
                "09 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\Files-and-Streams");

        Arrays.stream(root.listFiles())
                .filter(File::isFile)
                .forEach(f -> System.out.println(f.getName() + ": " + "[" + f.length() + "]"));
    }
}