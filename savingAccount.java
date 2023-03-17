package interfacedemo;

public class savingAccount implements Account{
    private double balance;
    private float interestRate;
    savingAccount(){
        balance=100;
        interestRate=10;

    }
    @Override
    public void withdraw(double amount) {
        if(amount<=balance)
            balance-=amount;
        else System.out.println("You dont have enough money to withdraw!!");
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }
    @Override
    public  double checkBalance() {
        return balance;
    }
    @Override
    public double calculatorInterestRate() {
        return (balance*(interestRate/100));
    }
}
