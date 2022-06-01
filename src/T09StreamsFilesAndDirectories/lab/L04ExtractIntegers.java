package T09StreamsFilesAndDirectories.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(fileInputStream);

        PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\ivoom\\IdeaProjects\\JavaAdvanced\\src\\T09StreamsFilesAndDirectories\\lab\\integers-out.txt"));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                writer.println(scanner.next());
            } else {
                scanner.next();
            }
        }
        writer.close();
    }
}
