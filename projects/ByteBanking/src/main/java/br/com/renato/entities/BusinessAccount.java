package br.com.renato.entities;

import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode
public class BusinessAccount extends Account{

    @NonNull private double limit;
    private double initialLimit;

    public BusinessAccount(@NonNull Long id, @NonNull String holder, @NonNull double limit) {
        super(id, holder);
        this.limit = limit;
        this.initialLimit = limit;
    }

    @Override
    public void deposit(double amount) {
        double debit = initialLimit - limit;

        if(hasDebit(debit)) {
            if(isAmountSufficientToPay(debit, amount)) {
                limit = initialLimit;
                amount -= debit;
                balance += amount;
                return;
            }

            limit += amount;
        }

        super.deposit(amount);
    }

    @Override
    public double withdraw(double amount) {
        if( (balance + limit) >= amount ) {
           if(amount >= balance) {
               double toWithdraw = amount;
               balance = 0.0;
               toWithdraw -= balance;
               limit -= toWithdraw;
               return amount;
           }

            balance -= amount;
            return amount;
        }

        return 0.0;
    }

    private static boolean hasDebit(double debit) {
        return debit >= 0.0;
    }

    private boolean isAmountSufficientToPay(double amount, double debit) {
        return debit <= amount;
    }

}
