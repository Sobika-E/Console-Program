import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();

        while (true) {
          System.out.println("\nChoose a mode:");
            System.out.println("Option 1: User");
            System.out.println("Option 2: Admin");
                 System.out.println("Option 3: Guest");
             System.out.println("Option 4: Exit");

            System.out.print("Enter your mode: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice==1) {
                System.out.println("Welcome to User mode");
                System.out.print("Enter Your name: ");
                String name = sc.nextLine();

                System.out.print("Enter Your unique ID: ");
                int id = sc.nextInt();
                sc.nextLine(); 

                hm.put(name, id);
                System.out.println("User registration successful!");
            } 
            
            
            else if (choice==2)
            {
                System.out.println("Welcome to Admin mode");
                System.out.println("The registered details of the users:");
                
                for (Map.Entry<String, Integer> entry : hm.entrySet())
                {
                    System.out.println("Name: " + entry.getKey() + ", ID: " + entry.getValue());
                }
            }
            
            
            else if (choice==3) 
            {
                
                System.out.println("Welcome to Guest mode");
                System.out.println("There are several users are available for our console application \n if you want to see please login");
                System.out.println("So please click 1 to login");
                
            }
            
            
            else if (choice == 4) {
                System.out.println("Exiting");
                break;
                
            } 
            else {
                System.out.println("Invalid option");
            }
            
        }

        
    }
}
