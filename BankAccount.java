public class BankAccount {
    String owner;
    Dollar balance;
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = new Dollar(0.0);
    }
    public String toString(){
        return "Owner: " + this.owner+ " Balance: "+ this.balance;
    }
}
