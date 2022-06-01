package T09StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class L02WriteToFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\output.txt");

            int read = inputStream.read();

            Set<Character> punctuations = Set.of(',', '.', '!', '?');

            while (read != -1) {

                if (!punctuations.contains((char) read)) {
                    outputStream.write(read);
                }
                read = inputStream.read();
            }

        } catch (IOException ignored) {

        }
    }
}
