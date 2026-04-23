import java.time.LocalDateTime;

public class Task {
    // Instance variables
    private String name;
    private LocalDateTime dueDate;
    private String subject;
    private double timeEstimate;
    private boolean completionStatus;
    // Constructor
    public Task(String name, String subject, LocalDateTime dueDate, double timeEstimate) {
        this.name = name;
        this.subject = subject;
        this.dueDate = dueDate;
        this.timeEstimate = timeEstimate;
        this.completionStatus = false;
    }

    public void markComplete() {
        completionStatus = true;
    }

    public boolean getCompletionStatus() {
        return completionStatus;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public double getTimeEstimate() {
        return timeEstimate;
    }

    public String toString() {
        return name + "(Subject: " + subject + ", Due: " + dueDate + ", Time: " + timeEstimate + "hrs, Status: "
                + completionStatus + ")";
    }
}
