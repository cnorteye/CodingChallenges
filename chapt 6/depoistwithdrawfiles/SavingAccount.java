package depoistwithdrawfiles;

public class SavingAccount {
    // fields
    private double interestRate; 
    private double balance; 

    //constructor accepts the amount of the savings account's starting balance
    public SavingAccount(double b){
        balance = b;
    }


    public double getBalance(){
        return balance; 
    }

    // the monthly interest rate is the annual interest rate divided by 12
    public void setMonthlyInterestRate(double annualRate){
        interestRate = annualRate/12/100;
    }

    // method to add interest rate to the balance
    public void addInterest(){
        balance += (balance * interestRate);
    }

    // method for depositing
    public double deposit (double d){
        
        return balance+=d; 
    }

    // method for withdrawing
    public double withdraw(double w){
        return balance-=w; 
    }



}

