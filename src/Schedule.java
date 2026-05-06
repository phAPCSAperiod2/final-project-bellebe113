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

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            if (t.getCompletionStatus()) {
                result.add(t);
            }
        }
        return result;
    }

    public void sortByDueDate() {
        Collections.sort(tasks, new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                int dateComparison = t1.getDueDate().compareTo(t2.getDueDate());
                if (dateComparison != 0) {
                    return dateComparison;
                }
                return Double.compare(t1.getTimeEstimate(), t2.getTimeEstimate());
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
        // Sort all tasks
        sortByDueDate();

        // Print incomplete tasks
        System.out.println("\n--- INCOMPLETE TASKS ---");
        ArrayList<Task> incomplete = getIncompleteTasks();
        if (incomplete.isEmpty()) {
            System.out.println("No incomplete tasks.");
        } else {
            for (Task t : incomplete) {
                System.out.println(t);
            }
        }

        // Print completed tasks
        System.out.println("\n--- COMPLETED TASKS ---");
        ArrayList<Task> completed = getCompletedTasks();
        if (completed.isEmpty()) {
            System.out.println("No completed tasks.");
        } else {
            for (Task t : completed) {
                System.out.println(t);
            }
        }
        System.out.println();
    }

}
