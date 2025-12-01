package Lab7Scenario3;

public class Book {
    public String title;
    public int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void addPages(int number) {
        if (number > 0) {
            this.pages += number;
            System.out.println(number + " sayfa eklendi.");
        }
    }

    public void printBook() {
        System.out.println("Kitap: " + title + ", Sayfa Sayısı: " + pages);
    }
}