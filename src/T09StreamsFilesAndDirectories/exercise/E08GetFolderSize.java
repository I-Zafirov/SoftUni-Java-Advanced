package T09StreamsFilesAndDirectories.exercise;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class E08GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("src/T09StreamsFilesAndDirectories/exercise/Exercises Resources");
        Deque<File> files = new ArrayDeque<>();
        files.offer(folder);
        int totalSize = 0;
        while(!files.isEmpty()){
            File currentFile = files.poll();
            File[] nestedFiles = currentFile.listFiles();
            for (File nestedFile : nestedFiles) {
                if(nestedFile.isDirectory()){
                    files.offer(nestedFile);
                } else {
                    totalSize+= nestedFile.length();
                }
            }
        }
        System.out.println("Folder size: " + totalSize);
    }
}
