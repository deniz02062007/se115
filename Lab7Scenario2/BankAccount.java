package Lab7Scenario2;
import java.util.Scanner;

public class BankAccount {

    private int accountID;
    private double balance;

    public BankAccount(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yatırılacak tutar 0'dan büyük olmalı!");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL çekildi. Kalan bakiye: " + balance);
        } else {

            System.out.println("Yetersiz bakiye! Borç hesaba (eksi bakiye) geçmek ister misiniz? (E/H)");

            Scanner sc = new Scanner(System.in);
            String response = sc.next();

            if (response.equalsIgnoreCase("E")) {
                balance -= amount; // Eksiye düşür
                System.out.println("İşlem onaylandı (Borç). Yeni bakiye: " + balance);
            } else {
                System.out.println("İşlem iptal edildi. Yetersiz bakiye!");
            }
        }
    }

    public void accountDetails() {
        System.out.println("Hesap Detayları");
        System.out.println("Hesap ID: " + accountID);
        System.out.println("Bakiye  : " + balance + " TL");
    }
}