package ExamPreparation.groomingSalon2;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }


    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)", this.name, this.age, this.owner);
    }
}
