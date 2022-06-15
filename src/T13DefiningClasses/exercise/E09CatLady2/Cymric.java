package T13DefiningClasses.exercise.E09CatLady2;

public class Cymric extends Cat {
    double furLenght;

    public Cymric(String name, double furLenght) {
        this.name = name;
        this.furLenght = furLenght;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", "Cymric", this.name, this.furLenght);
    }
}
