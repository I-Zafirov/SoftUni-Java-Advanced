package T09StreamsFilesAndDirectories.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E09CopyPicture {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream("src/T09StreamsFilesAndDirectories/exercise/image.jpg");
             FileOutputStream fos = new FileOutputStream("src/T09StreamsFilesAndDirectories/exercise/copyImage.jpg")) {
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
