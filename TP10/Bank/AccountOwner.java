package Bank;

public class AccountOwner{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(0);
        Salary salary = new Salary(bankAccount);
        BankCard bankCard = new BankCard(bankAccount);

        salary.start();
        bankCard.start();
    }
}