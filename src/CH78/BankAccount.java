/*
78. Define a BankAccount class with private attributes like
accountNumber, accountHolderName, and balance. Provide
public methods to deposit and withdraw money, ensuring that
these methods don't allow illegal operations like withdrawing
more money than the current balance
*/
package CH78;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void withdraw(double money){
        if(money>balance){
            System.out.println("You cannot withdraw more than available balance");
        }
        else{
            balance -= money ;
            System.out.printf("Rs.%.2f Withdrawn successfully\n",money);
        }
    }

    public void deposit(double money){
        if(money<=0){
            System.out.println("Invalid deposit request");
        }else{
            balance += money;
            System.out.printf("Rs.%.2f deposited successfully\n",money);
        }
    }

    public void checkBalance(){
        System.out.println("The balance is : "+this.balance);
    }
}
