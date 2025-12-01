package Lab7Scenario1;
public class Student {
    public String name;
    public int age;

    public Student() {
        this.name = "Bilinmiyor";
        this.age = 18;
    }
    /*
    CEVAP:
            - Eğer "public Student() { ... }" kodunu hiç yazmasaydık (Java'nın sağladığı boş constructor):
            name = null (String referans tipi olduğu için)
    age = 0 (int primitive tipi olduğu için) olacaktı.
           - Ancak Extension kısmında elle constructor yazıp varsayılan değer atadığımız için:
    name = "Bilinmiyor"
    age = 18 oldu.

    CEVAP:

     Hayır, hata almadık.
    Eğer sınıfa HİÇ constructor yazmasaydık, Java derleyicisi otomatik (implicit) bir tane sağlardı.
    Biz elle yazdığımızda ise zaten kendi yazdığımız kural çalıştı.
        */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printStudentInfo() {
        System.out.println("Öğrenci Adı: " + name + ", Yaşı: " + age);
        /*
           CEVAP: Hata almadık çünkü "Student class" içinde hem parametresiz (default) constructor'ı
           hem de parametreli constructor'ı aynı anda tanımladık.

        */
    }

}