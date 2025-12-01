package Lab7Scenario1;
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printStudentInfo();
        System.out.println();
        Student s2 = new Student("Ahmet", 21);
        s2.printStudentInfo();
    }
}