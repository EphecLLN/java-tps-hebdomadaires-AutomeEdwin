package Bank;

public class Salary extends Thread{
    private BankAccount account;

    public Salary(BankAccount bA){
        account = bA;
    }

    public void run(){
        for(int i=0; i<100; i++){
            account.deposit(10);
            System.out.println(account.getAmount());
        }
    }
}