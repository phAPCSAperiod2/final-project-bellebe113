public class Task{
    private String name;
    private String subject;
    private int dueDate;
    private int timeEstimate;
    private boolean completionStatus;

    public Task(String name, int dueDate, int timeEstimate)
    {
        this.name = name;
        if(completionStatus == true)
        {
            this.completionStatus = 
        }
    }

    public String getName()
    {
        return name;
    }
    public String getSubject()
    {
        return subject;
    }
    public int getDueDate()
    {
        return dueDate;
    }
    public int getTimeEstimate()
    {
        return timeEstimate;
    }
    public String toString()
    {
        return name + "(" + timeEstimate + "hrs/mins)"
    }
}
