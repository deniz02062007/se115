import java.util.Scanner;
public class lab5 {
public static int factorial(int a) {
    if (a==0) {
        return 1;
    }
   return a * factorial(a-1);
}
public static int sumDigits(int a) {
    if (a<10) {
        return a;
    }
    return a%10 + sumDigits(a/10);
}
public static long power(long a , int b) {
        if (b==0) {
            return 1; }
         return  a * power(a , b-1);
}
public static int fib(int a) {
    if (a==0) return 0;
    if (a==1)  return 1;
    int sonuc = fib(a-1) + fib(a-2);
    for (int i = 0; i <= a ; i++) {
        int[] arr = new int[sonuc];
    }
    return sonuc;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(factorial(a));
    System.out.println(sumDigits(a));
    System.out.println(power(2, 0));
    System.out.println(fib(a));
}
}
