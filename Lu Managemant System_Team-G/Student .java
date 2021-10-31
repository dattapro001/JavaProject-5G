  
 import java.util.*;

class StudentInformation {
	  
	public static Object set;
	private String StudentNameFirst;
	private String StudentNameLast;
	private String email;
	private int IDNumber;
	
	StudentInformation(String StudentNameFirst, String StudentNameLast, String email, int IDNumber)
	{    
		this.StudentNameFirst = StudentNameFirst;
	    this.StudentNameLast = StudentNameLast ;
	    this.email = email;
	    this.IDNumber = IDNumber ;
	 }
	  
	public String getStudentNameFirst()
	{
		return StudentNameFirst;
	}
	public String getStudentNameLast()
	{
		return StudentNameLast;
	}
	public String getemail()
	{
		return email;
	}
	public int getIDNumber()
	{
		return IDNumber;
	}
	 
	public String toString()
	{
		return StudentNameFirst+" "+StudentNameLast+" "+email+" "+IDNumber;
	}
 }
 


public class Student {

	public static void main(String[] args) {
		  
		Collection<StudentInformation> ch = new ArrayList<StudentInformation>();
		 
		
		Scanner input = new Scanner(System.in);  
		Scanner inputString = new Scanner(System.in); 
		int choice = 0;
		do {
			  System.out.println("1. Add or Enter Information");
		  	  System.out.println("2. Display Information");
		  	  System.out.println("3. Delete Information");
		  	  System.out.println("4. Update Information");
		  	  System.out.print("Enter Your Choice : ");
		  	  choice = input.nextInt();
		  	  
		  	  switch(choice) {
		  	  case 1:
		  	      System.out.print("Enter Your First Name: ");
		  	      String StudentNameFirst = inputString.nextLine();
		  	      System.out.print("Enter Your Last Name: ");
		  	      String StudentNameLast = inputString.nextLine();
		  	      System.out.print("Enter Your Email : ");
		  	      String email = inputString.nextLine();
		  	      System.out.print("Enter Your Student ID : ");
		  	      int IDNumber = input.nextInt();
		  	       
		  	     ch.add(new StudentInformation(StudentNameFirst,StudentNameLast,email,IDNumber));
		  	     
		  	  break;
		  	  case 2:
		  		 
		  		    
		  		  System.out.println("-----------------------------------------------");
		  		  
		  		  
		  		  Iterator<StudentInformation> i = ch.iterator();
		  		  
		  		   
		  		  while(i.hasNext()) {
		  			 StudentInformation s = i.next();  
		  			 System.out.println(s+" ");
		  		  }
		  		 System.out.println("-----------------------------------------------");
		  	  break;
		  	  case 3:
		  		 boolean found = false;  
		  		 System.out.print("Enter Your ID Number to delete all information : ");
		  		 System.out.println("\n Press 1 to continue ");
		  		 
		  		 IDNumber = input.nextInt();
		  		 System.out.println("-----------------------------------------------"); 
		  		 
		  		 i = ch.iterator();
		  		 while(i.hasNext()) {
		  		 StudentInformation s = i.next();
		  		 
		  			if(s.getIDNumber()==IDNumber) {
		  				i.remove();
		  				found = true;
		  			}
		  		 }   
		  			if(!found) {
		  				System.out.println("ID Number Not Found");
		  			}else {
		  				System.out.println("Record Deleted successfully.");
		  			 }
		  			System.out.println("-----------------------------------------------");
		  		break;
		  	case 4: 
		  		 found = false;
		  		 System.out.print("Enter Your ID Number to update information : ");
		  		 IDNumber = input.nextInt();
		  		 System.out.println("-----------------------------------------------"); 
		  		  
		  	     ListIterator<StudentInformation>li = ((List<StudentInformation>) ch).listIterator();
		  		 while(li.hasNext()) {
		  		 StudentInformation s = li.next();
		  			if(s.getIDNumber()==IDNumber) {
		  				System.out.print("Enter new First name : ");
		  				StudentNameFirst = inputString.nextLine();
		  				System.out.print("Enter new Last name : ");
		  				StudentNameLast = inputString.nextLine();
		  				System.out.print("Enter new Email : ");
		  				email = inputString.nextLine();
		  				System.out.print("Enter new ID number : ");
		  				IDNumber = input.nextInt();
		  				 
		  				li.set(new StudentInformation(StudentNameFirst,StudentNameLast,email, IDNumber));
		  				found = true ;
		  				}
		  			 }   
		  			 if(!found) {
		  				 System.out.println("Invalid");
		  			 }else {
		  				 System.out.println("Record updated successfully.");
		  			 }
		  			System.out.println("-----------------------------------------------");
		  		break;
		  		 }
		}while(choice!=0);
		
	 }
	
	
}
