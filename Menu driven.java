import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String name;
	    int n;
	    
	    Scanner sc=new Scanner(System.in);
	    
	   
	    ArrayList<String> list1=new ArrayList<>();
	    int flag=1;
	    
	    while(flag!=0)
	    {
	    
	    
	    System.out.println("enter choice");
	    System.out.println("1 for add: ");
	    System.out.println("2 for get: ");
	    System.out.println("3 for update: ");
	    System.out.println("4 for Delete");
	    System.out.println("5 for Display: ");
	    
	     int choice=sc.nextInt();
	    
	   
	    
	        
	    
	    if(choice ==1){
	        System.out.println("Enter how many value to add");
	        n=sc.nextInt();
	        for(int i=1;i<=n;i++)
	        {
	            name=sc.next();
	            list1.add(name);
	        }
            System.out.println("data entered sucessfully");
            
	        
	    }
	    else if(choice==2)
	    {
	        System.out.println(list1);
	         
	    }
	    else if(choice==3){
	       System.out.println("Enter the value to update and position");
	       System.out.println("Enter the string to update");
	       String name2=sc.next();
	       System.out.println("Enter the position to update");
	       int pos=sc.nextInt();
	       if(pos>=list1.size())
	       {
	           System.out.println("Enter valid index");
	           break;
	       }
	       else{
	       list1.set(pos,name2);
	       System.out.println(list1);
	       }
	        
	    
	    }
	    else if(choice==4)
	    {
	        System.out.println("Enter a value to remove");
	        int rem=sc.nextInt();
	        System.out.println(list1.remove(rem));
	        System.out.println(list1);
	        
	    }
	    else if(choice==5)
	    {
	        System.out.println(list1);
	    }
	    else
	    {
	    System.out.println("Loop will be terminated");
	    break;
	    }
	    }
	    
		

}
}
