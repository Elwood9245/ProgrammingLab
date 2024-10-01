
public class BankAccount {

    private Person person;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 0;

    /*
    * So what will happen if nextAccountNumber is not "static"?
    *
    * If "static" was deleted, every BankAccount instance will have its own
    * "nextAccountNumber", which means it will become an instance variable.
    * Each new instance starts with nextAccountNumber initialized to 0
    *
    * We need a shared nextAccountNumber in different instance,
    * so "static" is a must.
    */

    public BankAccount(Person person){
        this.person = person;
        this.balance = balance = 0.0;
        this.accountNumber = nextAccountNumber;
        ++nextAccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //Getter method of Balance
    public double getBalance() {
        return balance;
    }

    //Setter method of Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawFunds(double num){
        if(num > getBalance()){
            System.out.println("You do not have enough funds!");
        }
        else if (num > 0) {
        setBalance(getBalance() - num);
        System.out.println("Transaction Success");
        System.out.println("You have withdraw " + num + " pounds.");
        System.out.println("Your current balance is " + balance + " pounds.");
        }
        else {
            System.out.println("You should enter a positive number!");
        }
    }

    public void depositFunds(double num) {
        if (num > 0) {
            setBalance(balance + num);
            System.out.println("Transaction Success");
            System.out.println("You have deposited " + num + " pounds.");
            System.out.println("Your current balance is " + balance + " pounds.");
        } else {
            System.out.println("You should enter a positive number!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person.getName() + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void transferFunds(double amount, BankAccount bankAccount){
        if (amount > getBalance()){
            System.out.println("You do not have enough funds!");
        }
        else if (amount > 0) {
            setBalance(getBalance() - amount);
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("Transfer Success");
            System.out.println("You have transferred " + amount +
                    " pounds to account number " + bankAccount.getAccountNumber() + ".");
        }
        else {
            System.out.println("You should enter a positive number!");
            }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Elwood1", 25);
        Person person2 = new Person("Elwood2", 30);

        BankAccount a = new BankAccount(person1);
        BankAccount b = new BankAccount(person1);

        System.out.println(a.getAccountNumber()); // Output: 0
        System.out.println(b.getAccountNumber()); // Output: 1

        //deposit & withdraw test
        a.depositFunds(100.0);
        a.withdrawFunds(20.0);

        System.out.println(a.toString());
        System.out.println(b.toString());

        //Transfer test
        a.transferFunds(50.0, b);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
