package br.com.renato.entities;

import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode
public class SavingsAccount extends Account {

    // TAXA DE RENDIMENTO
    private static double YIELD = 1.05;
    private double savedMoney;

    public SavingsAccount(@NonNull Long id, @NonNull String holder) {
        super(id, holder);
    }

    // guardar
    public void save() {
      savedMoney += balance*YIELD;
      balance = 0.0;
    }

    public void save(double amount) {
        if(balance >= amount) {
           savedMoney += amount*YIELD;
           balance -= amount;
        }
    }

    // retirar
    public void reedem() {
        balance += savedMoney;
        savedMoney = 0.0;
    }

    public void reedem(double amount) {
        if(savedMoney >= amount) {
            savedMoney -= amount;
            balance += amount;
        }
    }

}
