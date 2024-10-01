public class savingAccount extends BankAccount{

    private double interestRate;

    public savingAccount(Person person){
        super(person);
    }

    @Override
    public void withdrawFunds(double num){
        if (getBalance() < num){
            System.out.println("You do not have enough funds!");
        }
        else if (num > 0) {
            setBalance(getBalance() - num);
            System.out.println("Transaction Success");
            System.out.println("You have withdraw " + num + " pounds.");
        }
        else {
            System.out.println("You should enter a positive number!");
        }
    }

    //Calculate the balance with interest.
    public void addInterest(){
        setBalance(getBalance() * (1 + interestRate / 100.0));
    }

}
