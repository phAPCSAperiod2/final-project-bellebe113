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
            
        }
    }
}
