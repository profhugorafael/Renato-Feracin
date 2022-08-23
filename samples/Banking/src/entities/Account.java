package entities;

public class Account {

  public String id;
  public String holder;
  private double balance;

  public double getBalance(){
    return balance;
  }

  public boolean deposit(double amount) {
    balance += amount;
    return true;
  }

  public boolean withdraw(double amount){
    if(balance >= amount) {
      balance -= amount;
      return true;
    }

    return false;
  }

  public boolean transfer(double amount, Account destinationAccount){
    if( withdraw(amount) ) {
      destinationAccount.deposit(amount);
      return true;
    }

    return false;
  }
}
