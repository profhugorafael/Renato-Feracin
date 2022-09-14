package br.com.renato.entities;

import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode
public class Account {

    @NonNull private Long id;
    @NonNull private String holder;
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            return amount*0.95;
        }

        return 0.0;
    }

    public void transfer(double amount, Account destinationAccount) {
        if(balance >= amount) {
            balance -= amount;
            destinationAccount.deposit(amount);
        }
    }

}
