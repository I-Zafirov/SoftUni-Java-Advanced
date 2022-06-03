package T09StreamsFilesAndDirectories.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class E10SerializeArrayList {
    public static void main(String[] args) {
        String path = "src/T09StreamsFilesAndDirectories/exercise/ArrayList.ser";

        List<String> birds = new ArrayList<>();
        birds.add("Chervenushka");
        birds.add("Sokol orko");
        birds.add("Kokilobegach");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            oos.writeObject(birds);
            Object listFromFile = ois.readObject();
            System.out.println(listFromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
