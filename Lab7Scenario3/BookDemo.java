package Lab7Scenario3;

public class BookDemo {
    public static void main(String[] args) {

        System.out.println("--- b1 oluşturuluyor ---");
        Book b1 = new Book("Yüzüklerin Efendisi", 500);
        b1.printBook();

        Book b2 = b1;

        System.out.println("\n--- b2 üzerinden sayfa ekleniyor (addPages(20)) ---");
        b2.addPages(20);

        System.out.println("\n--- Son Durumlar ---");
        System.out.print("b1: ");
        b1.printBook();

        System.out.print("b2: ");
        b2.printBook();

        /*
           CEVAP: Çünkü Java'da bir nesneyi başka bir değişkene atadığınızda (b2 = b1),
           nesnenin kopyası oluşturulmaz; sadece REFERANSI (hafıza adresi) kopyalanır.
           Şu an b1 ve b2 aynı hafıza adresindeki TEK BİR nesneyi işaret ediyor.

           CEVAP: Sadece 1 tane obje oluşturuldu (new Book... satırında).
           b1 ve b2 sadece o tek objeye giden iki farklı yol/etiket.
        */


        System.out.println("EXTENSION (Referans Karşılaştırma)");

        Book b3 = new Book("Yüzüklerin Efendisi", 520);
        System.out.print("b3: ");
        b3.printBook();
        System.out.println("\nKarşılaştırma 1 (b1 == b3): " + (b1 == b3));
        boolean isContentSame = b1.title.equals(b3.title) && (b1.pages == b3.pages);
        System.out.println("Karşılaştırma 2 (İçerik aynı mı?): " + isContentSame);

        /*
           - (b1 == b3) komutu bellekteki ADRESLERİ karşılaştırır. b1 ve b3 farklı zamanlarda
             "new" ile oluşturulduğu için belleğin farklı yerlerindedirler. Bu yüzden FALSE döner.

           - Alan karşılaştırması ise nesnelerin içindeki "title" ve "pages" değerlerine bakar.
             İçerikleri birebir aynı olduğu için bu kontrol TRUE (veya kodunuza göre doğru) çıkar


        */
    }
}