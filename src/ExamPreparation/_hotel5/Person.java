package ExamPreparation._hotel5;

public class Person {
    private String name;
    private int id;
    private int age;
    private String hometown = "n/a";

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
//        this.hometown = hometown;
        this.setHometown(hometown);
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Person {name}: {id}, Age: {age}, Hometown: {hometown}
    @Override
    public String toString() {
        return String.format("Person %s: %d, Age: %d, Hometown: %s"
                , name, id, age, hometown);
    }
}
