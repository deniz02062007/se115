package lab8Scenario1;
import java.util.Scanner;
public class Robot {
    private String modelName;
    private int batteryLevel;
    private boolean status;

    public Robot(String modelName , int batteryLevel , boolean status) {

        this.modelName=modelName;
        this.batteryLevel=batteryLevel;
        this.status=status;
    }
    public void setModelName(String modelName) { this.modelName=modelName;}
    public void setBatteryLevel(int batteryLevel) {this.batteryLevel=batteryLevel;}
    public void setStatus(boolean status) {this.status=status;}

    public String getModelName() {
        return modelName;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public boolean getStatus() {
        return status;
    }
    public void displayRobotInfo() {
        System.out.println("Robot Name: "+modelName+"\nBattery Level: "+batteryLevel);
        if(status==false){
            System.out.println("Status: Charging");
        }
        else {System.out.println("Status: Active");}

    }
    public boolean isBatteryEnough(int requiredAmount) {
        if(batteryLevel>=requiredAmount) return true;
        return false;
    }
    public int consumeBattery(int amount) {
        batteryLevel-=amount;
        if(batteryLevel<100) setStatus(false);
        if(getBatteryLevel()<0) return batteryLevel=0;
      else return batteryLevel;

    }
    public int chargeBattery(int amount) {
        batteryLevel+=amount;
        if(batteryLevel>=100) setStatus(true);
        if (batteryLevel>=100) {
            setStatus(true);
            return batteryLevel;
        }
        else return batteryLevel;
    }
    public void performTask(Task t) {
        System.out.println();
        System.out.println(this.modelName+" is Attempting to run "+t.getTaskName());
        if(status==false) {
            System.out.println("Failed "+modelName+" charging");
        }
        else {
            if(isBatteryEnough(t.getEnergyCost())){
                this.consumeBattery(t.getEnergyCost());
                    System.out.println(t.getTaskName()+" completed");
            }
            else System.out.println("Not enough energy");
        }
    }
    public void performTaskBatch(TaskBatch batch) {
        int totalCost = batch.getTotalEnergyCost();
        if(totalCost==0) {
            System.out.println("There are no existing tasks");
            return;
        }
        if (this.isBatteryEnough(totalCost)) {
            System.out.println("Robot has enough energy. Processing batch");
            for (int i = 0; i< batch.getTasks().length; i++) {
                if (batch.getTasks()[i] != null) {
                performTask(batch.getTasks()[i]);
                }
            }
            System.out.println();
            this.displayRobotInfo();
            }
        else System.out.println("Not enough energy");
    }
    }


