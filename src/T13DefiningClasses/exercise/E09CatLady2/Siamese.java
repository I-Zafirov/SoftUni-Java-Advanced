package T13DefiningClasses.exercise.E09CatLady2;

public class Siamese extends Cat {
    double earSize;

    public Siamese(String name, double earSize) {
        this.name = name;
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", "Siamese", this.name, this.earSize);
    }
}
