import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         HashMap<String, Integer> hm = new HashMap<>();

        while (true) {
             System.out.println("\nChoose a mode:");
              System.out.println("Option 1: User");
             System.out.println("Option 2: Security log");
               System.out.println("Option 3: Exit");

            System.out.print("Enter your mode: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            

          if (choice == 1) {
            System.out.println("Welcome to User mode");
                  System.out.print("Enter Your name: ");
               String name = sc.nextLine();

            System.out.print("Enter Your unique ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                hm.put(name, id);
                System.out.println("User registration successful!");
            } 
            
            
            else if (choice == 2)
            {
                System.out.println("Welcome to Security log mode");

                System.out.print("Enter your ID for verification: ");
                int checkId = sc.nextInt();
                sc.nextLine();

                if (hm.containsValue(checkId)) {
                    System.out.println("Access Accepted: ID  found in records.");
                    System.out.println("Your allow to visit our management");
                    
                } 
                
                
                else
                {
                    System.out.println("Access Rejected: ID already exists");
                }
                
                
            }
            
            
            else if (choice == 3) 
            {
                System.out.println("Exiting");
                break;
            } 
            
            
            else
            {
                System.out.println("Invalid option");
            }
            
            
        }

        
    }
}
