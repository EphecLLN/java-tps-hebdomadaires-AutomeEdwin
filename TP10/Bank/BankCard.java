package Bank;

public class BankCard extends Thread{
    private BankAccount account;

    public BankCard(BankAccount bA){
        account = bA;
    }

    public void run(){
        for(int i=0; i<100; i++){
            account.withdraw(10);
            System.out.println(account.getAmount());
        }
    }
}