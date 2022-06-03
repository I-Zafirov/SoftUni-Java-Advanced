package T09StreamsFilesAndDirectories.exercise;

import java.io.*;

public class E03AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/T09StreamsFilesAndDirectories/exercise/input.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("src/T09StreamsFilesAndDirectories/exercise/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
