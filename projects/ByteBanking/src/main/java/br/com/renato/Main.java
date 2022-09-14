package br.com.renato;

import br.com.renato.entities.Account;
import br.com.renato.entities.BusinessAccount;
import br.com.renato.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Account acc1 = new Account(1L, "Joao");

        // upcasting
        Account acc2 = new SavingsAccount(1L, "Pedro");

        // dowcasting
        Account contaMaria = new BusinessAccount(1L, "Maria", 100.0);
        BusinessAccount contaBusinessMaria = (BusinessAccount) contaMaria;

        // usando com upcasting
        ((SavingsAccount) acc2).save();

        System.out.println();

    }
}