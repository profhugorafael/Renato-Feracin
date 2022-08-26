import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc1 = new Account("Jhon");
        Account acc2 = new Account("Martha");
        
        acc2.deposit(100.0);

        acc1.deposit(200.0);
        System.out.println("Balance = $" + acc1.getBalance());
        
        acc1.deposit(200.0);
        System.out.println("Balance = $" + acc1.getBalance());
        
        acc1.withdraw(100.0);
        System.out.println("Balance = $" + acc1.getBalance());

        acc1.withdraw(500.0);
        System.out.println("Balance = $" + acc1.getBalance());
        
        System.out.println("--------------------");
        
        System.out.println("Balance ACC1= $" + acc1.getBalance());
        System.out.println("Balance ACC2= $" + acc2.getBalance());
        acc1.transfer(225, acc2);
        System.out.println("Balance ACC1= $" + acc1.getBalance());
        System.out.println("Balance ACC2= $" + acc2.getBalance());
        
        System.out.println("--------------------");
        System.out.println(acc1);
        System.out.println(acc2);

    }
}
