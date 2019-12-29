package Bank;

public class BankAccount extends Thread{
    private double solde;

    public BankAccount(double solde){
        this.solde = solde;
    }

    public void deposit(double amount){
        this.solde += amount;
    }

    public void withdraw(double amount){
        this.solde -= amount;
    }

    public double getAmount(){
        return this.solde;
    }
}