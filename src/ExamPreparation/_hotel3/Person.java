package ExamPreparation._hotel3;

public class Person {
    private String name;
    private int id;
    private int age;
    private String hometown;

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    @Override
    public String toString() {
        return String.format("Person %s: %d, Age: %d, Hometown: %s", name, id, age, hometown);
    }
}
