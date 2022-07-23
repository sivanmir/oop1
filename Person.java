public class Person {
    String name;
    Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", birthDate=" + birthDate;
    }
}
