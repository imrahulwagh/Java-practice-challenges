package CH78;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("9754","Rahul Wagh");
        acc.deposit(1000);
        acc.checkBalance();
        acc.withdraw(500);
        acc.deposit(2000);
        acc.checkBalance();
    }
}
