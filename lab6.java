import java.util.Random;
import java.util.Arrays;

public class lab6 {
    //for task:1
    public static int[] expandRoster(int[] oldRoster, int newSize) {
        int[] newRoster = new int[newSize];
        System.arraycopy(oldRoster, 0, newRoster, 0, oldRoster.length);
        return newRoster;
    }
//for task:2
    public static int[] rotateRight(int[] originalArray) {
        int n = originalArray.length;
        if (n == 0) {
            return new int[0];
        }
        int[] rotatedArray = new int[n];
        rotatedArray[0] = originalArray[n - 1];
        for (int i = 0; i < n - 1; i++) {
            rotatedArray[i + 1] = originalArray[i];
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        //Scenario 0:
        int[] myArr = {4, 8, 15, 16, 23, 42};
        System.out.println(myArr.length);
        System.out.println(myArr[0]);
        System.out.println(myArr.length - 1);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        // System.out.println(myArr[10]);
        /*
         * "ArrayIndexOutOfBoundsException" hatası verdi.
         * * nedeni dizinin eleman sayısı dışında eleman vermiş olmamız
         */

//Scenario 1:
                int[] oldRoster = new int[20];
                int startingID = 1000;
                for (int i = 0; i < oldRoster.length; i++) {
                    oldRoster[i] = startingID + i;
                }
                int newCapacity = 42;
                int[] newRoster = expandRoster(oldRoster, newCapacity);
                System.out.println(oldRoster.length);
                for (int i = 0; i < oldRoster.length; i++) {
                    System.out.println("  İndeks " + i + ": " + oldRoster[i]);
                }
                System.out.println(newRoster.length);
                for (int i = 0; i < newRoster.length; i++) {
                    System.out.println("  İndeks " + i + ": " + newRoster[i]);

                }
        //Scenario 2:
        Random rand = new Random();
        int size = rand.nextInt(11) + 10;
        int[] original = new int[size];
        for (int i = 0; i < original.length; i++) {
            original[i] = rand.nextInt(100);
        }
        System.out.println("Orijinal Dizi");
        System.out.println("Boyut: " + original.length);
        System.out.println(Arrays.toString(original));
        int[] rotated = rotateRight(original);
        System.out.println("\nSağa Kaydırılmış Dizi ");
        System.out.println(Arrays.toString(rotated));

        //Scenario 3:
                final int SIMULATION_DAYS = 1_000_000;
                int sunnyCount = 0;
                int cloudyCount = 0;
                int rainyCount = 0;
                int stormyCount = 0;
                int[] probabilityArray = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
                for (int i = 0; i < SIMULATION_DAYS; i++) {
                    int randomIndex = rand.nextInt(probabilityArray.length);
                    int weatherType = probabilityArray[randomIndex];
                    switch (weatherType) {
                        case 0:
                            sunnyCount++;
                            break;
                        case 1:
                            cloudyCount++;
                            break;
                        case 2:
                            rainyCount++;
                            break;
                        case 3:
                            stormyCount++;
                            break;
                    }
                }
                System.out.println("\nSimülasyon Sonuçları:");
                double sunnyPercent = (double) sunnyCount / SIMULATION_DAYS * 100.0;
                double cloudyPercent = (double) cloudyCount / SIMULATION_DAYS * 100.0;
                double rainyPercent = (double) rainyCount / SIMULATION_DAYS * 100.0;
                double stormyPercent = (double) stormyCount / SIMULATION_DAYS * 100.0;
                System.out.printf("Sunny (Güneşli):  %d gün (%.2f%%) - (Hedef: 40%%)\n",
                        sunnyCount, sunnyPercent);
                System.out.printf("Cloudy (Bulutlu): %d gün (%.2f%%) - (Hedef: 30%%)\n",
                        cloudyCount, cloudyPercent);
                System.out.printf("Rainy (Yağmurlu):  %d gün (%.2f%%) - (Hedef: 20%%)\n",
                        rainyCount, rainyPercent);
                System.out.printf("Stormy (Fırtınalı):  %d gün (%.2f%%) - (Hedef: 10%%)\n",
                        stormyCount, stormyPercent);

                //Scenario 4:
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Dizi:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ,");
            }
        }
        int peakCount = 0;
        int tallestPeak = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            int solKomsu = arr[i - 1];
            int suAnki = arr[i];
            int sagKomsu = arr[i + 1];
            if (suAnki > solKomsu && suAnki > sagKomsu) {
                System.out.println(suAnki);
                peakCount++;
                if (suAnki > tallestPeak) {
                    tallestPeak = suAnki;
                }
            }
        }
        System.out.println("Toplam Zirve Sayısı: " + peakCount);
        if (peakCount == 0) {
            System.out.println("zirve yok");
        } else {
            System.out.println("En Yüksek Zirvenin Değeri: " + tallestPeak);
        }

        //Bonus Question:
final int STUDENTS = 5;
final int QUIZZES = 4;
int[][] scores = new int[STUDENTS][QUIZZES];
        System.out.println("Sınav Notu Tablosu:");
        for (int i = 0; i < STUDENTS; i++) {
        System.out.print("Student " + i + ": ");
            for (int j = 0; j < QUIZZES; j++) {
scores[i][j] = rand.nextInt(101);
                System.out.printf("%-5d", scores[i][j]);
            }
                    System.out.println();
        }
                System.out.println("\nÖğrenci Ortalamaları:");
        for (int i = 0; i < STUDENTS; i++) {
double studentSum = 0;
            for (int j = 0; j < QUIZZES; j++) {
studentSum += scores[i][j];
        }
double studentAverage = studentSum / QUIZZES;
            System.out.printf("Student %d Ortalaması: %.2f\n", i, studentAverage);
        }
                System.out.println("\n--- Quiz Ortalamaları ---");
        for (int j = 0; j < QUIZZES; j++) {
double quizSum = 0;
            for (int i = 0; i < STUDENTS; i++) {
quizSum += scores[i][j];
        }
double quizAverage = quizSum / STUDENTS;
            System.out.printf("Quiz %d Ortalaması: %.2f\n", j, quizAverage);
        }
int highestScore = scores[0][0];
int bestStudentIndex = 0;
int bestQuizIndex = 0;
        for (int i = 0; i < STUDENTS; i++) {
        for (int j = 0; j < QUIZZES; j++) {
        if (scores[i][j] > highestScore) {
highestScore = scores[i][j];
bestStudentIndex = i;
bestQuizIndex = j;
                }
                        }
                        }
        System.out.println("En Yüksek Not: " + highestScore);
        System.out.printf("Konum: (Student %d, Quiz %d)\n", bestStudentIndex, bestQuizIndex);
    }}










