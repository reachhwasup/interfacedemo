package interfacedemo;

public class CreditCardAccount implements Account{
    private double balance;
    private float interestRate;
    private double limitCredit;
    CreditCardAccount(savingAccount savingAccount){
        balance=100;
        interestRate=10;
        limitCredit=50;
    }
    @Override
    public void withdraw(double amount) {
        if(amount<=limitCredit){
            if (amount<=balance){
                balance-=amount;
            }
            else System.out.println("Insufficient balance!!!");
        }
        else {
            System.out.println("amount exceed the limit!!!");
        }

    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    public double calculatorInterestRate(){
        return (balance*(interestRate/100));
    }
}
