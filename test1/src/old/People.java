package old;

public abstract class People {
    String name;
    int age;
    String profession;

    public abstract String getName();
    public abstract int getAge();
    public abstract String getProfession();
    People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
