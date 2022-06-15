package T13DefiningClasses.exercise.E09CatLady2;

public class StreetExtraordinaire extends Cat {
    double decibels;

    public StreetExtraordinaire(String name, double decibels) {
        this.name = name;
        this.decibels = decibels;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", "StreetExtraordinaire", this.name, this.decibels);
    }
}
