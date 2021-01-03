public class Teacher {
    private String name;
    private String birthday;
    private String country;
    private int fixedSalary;
    private int bonusSalary;
    private int penaltySalary;

    public Teacher(String name, String birthday, String country, int fixedSalary, int bonusSalary, int penaltySalary) {
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.fixedSalary = fixedSalary;
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
    }

    public String getName() {
        return name;
    }

    public int currentSalary() {
        return fixedSalary + bonusSalary - penaltySalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                ", fixedSalary=" + fixedSalary +
                ", bonusSalary=" + bonusSalary +
                ", penaltySalary=" + penaltySalary +
                '}';
    }
}
