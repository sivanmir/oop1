public class main {
    public static void main(String[] args) {
        Person person= new Person("sivan", new Date(23,10,2000));
        Computer comp= new Computer("hp", 15000,3, (float) 3.2,true);
        BankAccount leumi= new BankAccount("rotem");

        System.out.println(person);
        System.out.println(comp);
        System.out.println(leumi);
    }
}
