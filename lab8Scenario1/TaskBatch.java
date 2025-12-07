package lab8Scenario1;

public class TaskBatch {
    private Task[] tasks;
    private int taskCounter;
    public TaskBatch() {
        this.tasks= new Task[5];
        this.taskCounter=0;
    }
    public void addTask(Task t) {
        if(taskCounter<5) {tasks[taskCounter]=t;
            taskCounter++;
        }
        else System.out.println("Tasks already full , do not try add more");
    }
    public int getTotalEnergyCost() {
        int sum=0;
    for(int i=0 ; i<taskCounter; i++) {
        sum+=tasks[i].getEnergyCost();
    }
    if(taskCounter==0) System.out.println("There are no existing tasks");
    return sum;
    }
    public Task[] getTasks() {
            if(taskCounter==0) System.out.println("There are no existing tasks");
        return tasks;
        }
        public void printBatchInfo() {

        if(taskCounter==0) System.out.println("There are no existing tasks");

           else {
            System.out.println();
               for(int i=0; i<taskCounter ; i++){
                tasks[i].describeTask();
                System.out.println();
            }
        }
        }
    }

