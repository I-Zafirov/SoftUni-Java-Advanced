package T09StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class L01ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            int read = inputStream.read();

            while (read != -1) {
                System.out.print(Integer.toBinaryString(read) + " ");
                read = inputStream.read();
            }

        } catch (IOException ignored) {

        }
    }
}
