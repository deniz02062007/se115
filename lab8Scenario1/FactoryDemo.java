package lab8Scenario1;
import java.util.Scanner;
public class FactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Robot r1= new Robot("X1" ,400, true);
        Robot r2= new Robot("X2" ,100, true);

        Task t1 = new Task("carrying a box" , 20);
        Task t2 = new Task("mow the lawn" , 60);
        Task t3 = new Task("washing dishes" , 30 );
        Task t4 = new Task("wipe the floor" , 35);
        Task t5 = new Task("cook food" , 50);

    r1.displayRobotInfo();
        System.out.println();
    r2.displayRobotInfo();

        System.out.println("\nenter a amount?");
    int N = sc.nextInt();

    r1.consumeBattery(N);
    r1.displayRobotInfo();

   r1.performTask(t2);

        System.out.println();
    r1.displayRobotInfo();

    TaskBatch HomeTasks = new TaskBatch();
    HomeTasks.addTask(t1);
    HomeTasks.addTask(t2);
    HomeTasks.addTask(t3);
    HomeTasks.addTask(t4);
    HomeTasks.addTask(t5);
        HomeTasks.printBatchInfo();
        System.out.println("Total energy cost of the HomeTasks: "+HomeTasks.getTotalEnergyCost());
     r1.performTaskBatch(HomeTasks);
}}
