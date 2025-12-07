package lab8Scenario1;

public class Task {
    private String taskName;
    private int energyCost;

    public Task(String taskName , int energyCost) {
        this.energyCost=energyCost;
        this.taskName=taskName;
    }

    public void setEnergyCost(int energyCost) { this.energyCost = energyCost; }
    public void setTaskName(String taskName) {this.taskName=taskName; }

    public int getEnergyCost() {
        return energyCost;
    }
    public String getTaskName() {
        return taskName;
    }
    public void describeTask() {
        System.out.println("Task name: " + taskName+"\nEnergy cost: " +energyCost);
    }
}
