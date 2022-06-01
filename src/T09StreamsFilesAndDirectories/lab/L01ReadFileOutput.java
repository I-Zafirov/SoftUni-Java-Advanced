package T09StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L01ReadFileOutput {
    public static void main(String[] args) {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\output.txt");
            int read = inputStream.read();

            while (read != -1) {
                String output = Integer.toBinaryString(read) + " ";

                for (char c : output.toCharArray()) {
                    outputStream.write(c);
                }

                read = inputStream.read();
            }

        } catch (IOException ignored) {

        }
    }
}
