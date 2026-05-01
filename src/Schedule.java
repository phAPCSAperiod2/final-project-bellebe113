import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Schedule {
    private ArrayList<Task> tasks;

    public Schedule() {
        tasks = new ArrayList<Task>();
    }

    // Adds a task to the list
    public void addTask(Task t) {
        tasks.add(t);
    }

    // Removes a task by name
    public boolean removeTask(String name) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName().equalsIgnoreCase(name)) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> getAllTasks() {
        return tasks;
    }

    public ArrayList<Task> getIncompleteTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            if (!t.getCompletionStatus()) {
                result.add(t);
            }
        }
        return result;
    }

    public void sortByDueDate() {
        Collections.sort(tasks, new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                return t1.getDueDate().compareTo(t2.getDueDate());

            }
        });
    }

    public Task getNextTask() {
        // Sort taskss
        // Return first incomplete task
        sortByDueDate();
        for (Task t : tasks) {
            if (!t.getCompletionStatus()) {
                return t;
            }
        }
        return null;
    }

    public void printSchedule() {
        // Loop thruough tasks and print each one
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

}
