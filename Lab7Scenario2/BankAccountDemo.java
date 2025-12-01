package Lab7Scenario2;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount(101, 1000.0);
        BankAccount acc2 = new BankAccount(102, 5000.0);

        System.out.println("Hoşgeldiniz! İşlem yapılacak hesap: " + acc1.getAccountID());

        boolean quit = false;

        while (!quit) {
            System.out.println("\nLütfen bir işlem seçiniz:");
            System.out.println("1 -> Para Yatır (Deposit)");
            System.out.println("2 -> Para Çek (Withdraw)");
            System.out.println("3 -> Hesap Detayları (Account Details)");
            System.out.println("4 -> Çıkış (Exit)");
            System.out.print("Seçiminiz: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yatırılacak tutar: ");
                    double depAmount = sc.nextDouble();
                    acc1.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Çekilecek tutar: ");
                    double withAmount = sc.nextDouble();
                    acc1.withdraw(withAmount);
                    break;
                case 3:
                    acc1.accountDetails();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    quit = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }

        System.out.println("\nEkstra Senaryo Testi");
        System.out.println("Eski Hesap ID: " + acc1.getAccountID());

        acc1.setAccountID(999);

        System.out.println("Yeni Hesap ID: " + acc1.getAccountID());

        System.out.println("\nDiğer Hesap (acc2) Durumu:");
        acc2.accountDetails();
    }
}