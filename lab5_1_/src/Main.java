import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongUserException{
        Scanner sc = new Scanner(System.in);
        int choice;
        User[] users = new User[5];
        int index = 0;
       while (true) {
           System.out.println("Choose an option:\n1. Register a user\n2.Login");
         choice = Integer.parseInt(sc.nextLine());
         switch (choice) {
             case 1:
                 try {
                     System.out.println("Enter Username, number and your password");
                     String user = sc.nextLine();
                     for (User a : users) {
                         if (a != null && a.getUsername() == user) {
                             System.out.println("There is already a profile with this username!");
                             break;
                         }
                     }
                     String number = sc.nextLine();
                     String password = sc.nextLine();
                     System.out.println("Enter your password again");
                     if (password.equals(sc.nextLine())) {
                         users[index] = new User(user, password, number);
                         System.out.println("Successful registration!");
                         index++;
                     } else {
                         System.out.println("Passwords dont match!\n");
                     }
                     break;
                 } catch (WrongUserException exc) {
                     System.out.println(exc.getMessage());
                 }

             case 2:
                 System.out.println("Enter your username and password:");
                 String userLogin = sc.nextLine();
                 String passLogin = sc.nextLine();
                 for (User a:
                      users) {
                     if (a != null && a.getPassword() == passLogin && a.getUsername() == userLogin) {
                         System.out.println("Successful login!");
                         break;
                     }
                 }
                 System.out.println("There isn't a profile with these username and password...");
                 break;

             default:
                 System.out.println("Invalid choice!");
                 break;
                 
         }
       }

    }
}
