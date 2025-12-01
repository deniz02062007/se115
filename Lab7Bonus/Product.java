package Lab7Bonus;

public class Product {
    private String name;
    private int stock;
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
    public void buyOne() {
        if (stock > 0) {
            stock--;
            System.out.println(name + " satın alındı. Kalan stok: " + stock);
        } else {
            System.out.println("Stok tükendi");
        }
    }
    public void printInfo() {
        System.out.println("Ürün: " + name + " | Stok: " + stock);
    }
}