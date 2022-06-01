package T09StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class L03CopyBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\output.txt");

            int read = inputStream.read();

            PrintWriter writer = new PrintWriter(outputStream);

            while (read != -1) {
                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }

                read = inputStream.read();
            }

            writer.close();
//            writer.flush();

        } catch (IOException ignored) {

        }
    }
}
