package T09StreamsFilesAndDirectories.exercise;

import java.io.*;

public class E11SerializeCustomObject {
    public static void main(String[] args) {
        Course course = new Course();
        course.name = "Java Advanced";
        course.numberOfStudents = 250;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/T09StreamsFilesAndDirectories/exercise/course.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/T09StreamsFilesAndDirectories/exercise/course.ser"))) {
            oos.writeObject(course);

            Course courseFromFile = (Course) ois.readObject();
            System.out.println(courseFromFile.name);
            System.out.println(courseFromFile.numberOfStudents);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
