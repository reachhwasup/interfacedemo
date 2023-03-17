package interfacedemo;

public class Main {
    public static void main(String[] args) {

//        CreditCardAccount obj = new CreditCardAccount();
//        Account obj2= new savingAccount();


        BankingServiceII credit= new BankingServiceII(new CreditCardAccount(new savingAccount()));
        credit.deposit(10000);
        System.out.println("CreditCard Balance: "+credit.showBalance());
        credit.withdrawMoney(10);
        System.out.println("Withdraw "+credit.showBalance());

        BankingServiceII saving = new BankingServiceII(new CreditCardAccount(new savingAccount()));
        saving.deposit(500);
        System.out.println("Saving Balance: "+saving.showBalance());

    }
}
