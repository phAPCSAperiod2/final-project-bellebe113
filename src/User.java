public class User{
    private String name;
    private Schedule schedule;

    public User(String name)
    {
        this.name = name;
        this.schedule = new Schedule();
    }

    public String getName()
    {
        return name;
    }

    public Schedule getSchedule()
    {
        return schedule;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
