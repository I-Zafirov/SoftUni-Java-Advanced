package ExamPreparation.arena2;

public class Gladiator {
    private String name;
    private Stat stat;
    private Weapon weapon;

    public Gladiator(String name, Stat stat, Weapon weapon) {
        this.name = name;
        this.stat = stat;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStatPower() {
        return this.stat.getAgility() + this.stat.getFlexibility() + this.stat.getIntelligence()
                + this.stat.getSkills() + this.stat.getStrength();
    }

    public int getWeaponPower() {
        return this.weapon.getSharpness() + this.weapon.getSize() + this.weapon.getSolidity();
    }

    public int getTotalPower() {
        return this.getStatPower() + this.getWeaponPower();
    }

    @Override
    public String toString() {
        return String.format("%s - %d%n  Weapon Power: %d%n  Stat Power: %d", this.getName(), this.getTotalPower(),
                this.getWeaponPower(), this.getStatPower());
    }
}
