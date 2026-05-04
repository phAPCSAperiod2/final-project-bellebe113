import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        User user = new User(userName);

        while(true){
            System.out.println("======TASK MANAGER======");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Remove Task");
            System.out.println("5. Next Task");
            System.out.println("6. Exit");
            System.out.println("Choose option: ");

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1)
            {
                System.out.print("Task name: ");
                String name = input.nextLine();

                System.out.print("Subject: ");
                String subject = input.nextLine();

                System.out.print("Hours needed: ");
                double hours = input.nextDouble();
                input.nextLine();

                System.out.print("Due year: ");
                int year = input.nextInt();

                System.out.print("Due month: ");
                int month = input.nextInt();

                System.out.print("Due day: ");
                int day = input.nextInt();

                System.out.print("Due hour (0-23): ");
                int hour = input.nextInt();

                System.out.print("Due minute: ");
                int minute = input.nextInt();
                input.nextLine();

                LocalDateTime dueDate = LocalDateTime.of(year, month, day, hour, minute);

                Task t = new Task(name, subject, dueDate, hours);
                user.getSchedule().addTask(t);

                System.out.println("Task added!");
            }

            else if (choice == 2)
            {
                user.getSchedule().printSchedule();
            }
            else if (choice == 3)
            {
                System.out.print("Enter task name to mark complete: ");
                String name = input.nextLine();

                Schedule s = user.getSchedule();

                for (Task t : s.getAllTasks()) {
                    if (t.getName().equalsIgnoreCase(name)) {
                        t.markComplete();
                        System.out.println("Marked complete!");
                        break;
                    }
                }

            } else if (choice == 4) {
                System.out.print("Enter task name to remove: ");
                String name = input.nextLine();

                boolean removed = user.getSchedule().removeTask(name);

                if (removed) {
                    System.out.println("Task removed!");
                } else {
                    System.out.println("Task not found.");
                }

            } else if (choice == 5) {
                Task next = user.getSchedule().getNextTask();

                if (next != null) {
                    System.out.println("Next task:");
                    System.out.println(next);
                } else {
                    System.out.println("No incomplete tasks.");
                }

            } else if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }
        }

        input.close();
    }


        }


