package entities;

import java.util.Random;

public class Account {

  public int id;
  public String holder;
  private double balance;
  
  public Account(String holder) {
    Random random = new Random();
    this.id = random.nextInt(1000);
    this.holder = holder;
    this.balance = 0.0;
  }

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

  @Override
  public String toString() {
    return "Account [balance=" + balance + ", holder=" + holder + ", id=" + id + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((holder == null) ? 0 : holder.hashCode());
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Account other = (Account) obj;
    if (holder == null) {
      if (other.holder != null)
        return false;
    } else if (!holder.equals(other.holder))
      return false;
    if (id != other.id)
      return false;
    return true;
  }

  
  
}
