
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> userCredentials = new HashMap<>();

        boolean shouldRun = true;
        while (shouldRun) {
            System.out.println("Choose an option: ");
            System.out.println("1. Create account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAccount(sc, userCredentials);
                    break;
                case 2:
                    login(sc, userCredentials);
                    break;
                case 3:
                    System.out.println("GoodBye!");
                    shouldRun = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        sc.close();
        
    }

    private static void createAccount(Scanner sc, Map<String, String> userCredentials){
        System.out.println("Enter a username: ");
        String username = sc.nextLine();

        if (userCredentials.containsKey(username)) {
            System.out.println("That username is already taken. Please try again");
            return;
        }

        System.out.println("Enter a password: ");
        String password = sc.nextLine();

        userCredentials.put(username, password);
        System.out.println("Account created successfully!");
    }

    private static void login(Scanner sc, Map<String, String>usercredentials){
        System.out.println("Enter your username: ");
        String username = sc.nextLine();

        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        if (!usercredentials.containsKey(username)) {
            System.out.println("Invalid username. Please try again.");
            return;
        }

        if (!usercredentials.get(username).equals(password)) {
            System.out.println("Invalid password. Please try again.");
            return;
        }
        System.out.println("Login Successful!");
    }
}
