package Lab7Bonus;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mağazada kaç çeşit ürün olacak?: ");
        int count = sc.nextInt();
        sc.nextLine();
        Product[] inventory = new Product[count];
        System.out.println("\nStok Girişi");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + ". Ürün Bilgileri:");
            System.out.print("İsim: ");
            String name = sc.nextLine();
            System.out.print("Stok Adedi: ");
            int stock = sc.nextInt();
            sc.nextLine();
            inventory[i] = new Product(name, stock);
        }
        System.out.println("\nSatış Ekranı (Çıkmak için 'Q' basınız)");
        boolean keepShopping = true;
        while (keepShopping) {
            System.out.print("\nSatın almak istediğiniz ürünün adı: ");
            String inputName = sc.nextLine();
            if (inputName.equalsIgnoreCase("Q")) {
                keepShopping = false;
                System.out.println("Alışveriş sonlandırılıyor...");
            } else {
                boolean isFound = false;
                for (int i = 0; i < inventory.length; i++) {
                    if (inventory[i].getName().equalsIgnoreCase(inputName)) {
                        inventory[i].buyOne();
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    System.out.println("Böyle bir ürün yok");
                }
            }
        }
        System.out.println("\nGüncel Stok Durumu");
        for (int i = 0; i < inventory.length; i++) {
            inventory[i].printInfo();
        }
    }
}