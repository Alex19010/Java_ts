import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " внесено. Текущий баланс: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " снято. Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств. Операция не выполнена.");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Счет добавлен: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Счет удален: " + accountNumber);
                return;
            }
        }
        System.out.println("Счет с номером " + accountNumber + " не найден.");
    }

    public void deposit(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Счет с номером " + accountNumber + " не найден.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Счет с номером " + accountNumber + " не найден.");
    }
}

public class UserAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 2000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.deposit("123456", 500);
        bank.withdraw("654321", 1000);

        bank.removeAccount("123456");
    }
}
