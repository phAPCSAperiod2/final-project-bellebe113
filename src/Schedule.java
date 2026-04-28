import java.until.ArrayList;
import java.util.List;

public class Schedule {
    private ArrayList<Task> tasks;
    private ArrayList<String> workTime;

    public Schedule() {
        tasks = new ArrayList<Task>();
        workTime = new ArrayList<String>();
    }

    // Adds a task to the list
    public void addTask(Task t) {
        tasks.add(t);
    }

    // Removes a task
    public boolean removeTask(Task t) {
        for (int i = 0; i < tasks.size(); i++) {
            if (task.get(i).getName().equals(name)) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> getAllTasks() {
        return tasks;
    }

public ArrayList<Task> getIncompleteTasks()
{
    ArrayList<Task> result = new ArrayList<>();
    for(Task t : tasks){
        if()
    }
    return result;
}

    public void sortByDueDate() {

    }

    public Task getNextTask() {
        // Sort tasks
        // Return first incomplete task

        return null;
    }

    public void printSchedule() {
        // Loop thruough tasks and print each one
    }

}
