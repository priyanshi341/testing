package lockedMe.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DisplayDataClass d=new DisplayDataClass();
		try {
			System.out.println("--> Application Name is: (LockedMe.com) and file name is--> (Project_1)");
			System.out.println("--> Developer Name is: (Priyanshi)");
			System.out.println();
			System.out.println("Please enter (Go) to move further ");
			String s=sc.next();
			if(s.equalsIgnoreCase("go"))
			{
				
		while(true) {
			System.out.println();
		System.out.println("Enter The Choice");
		System.out.println("------------------");
		System.out.println("1) Retrieving the File Names \r\n"
				+ "\r\n"
				+ "2) Operations On Files (Like Add Delete and Search)\r\n"
				+ "\r\n"
				+ "3) Option to Close the Application");
		 System.out.println("--------------------");
	
   int choice=sc.nextInt();
   if(choice==3)
   {
  	 break;
   }
   switch(choice)
   {
   case 1:
  	 d.displayallfile();
  	 break;
  	 
   case 2:
  	 while(true)
  	 {
  		 System.out.println();
  		 System.out.println("Enter the Choice On Which Opeartion You Want To Perform:");
  		 System.out.println("------------------");
  		 System.out.println("a) Add a  File\r\n"
  		 		+ "\r\n"
  		 		+ "b) Delete a File \r\n"
  		 		+ "\r\n"
  		 		+ "c) Search a File\r\n"
  		 		+ "\r\n"
  		 		+ "d) Close and return to the Main Context");
  		 System.out.println("--------------------");
  		 String ch=sc.next();
  		 if(ch.equalsIgnoreCase("d"))
  		 {
  			 break;
  		 }
  		 switch(ch) {
  		 case "a":
  			 System.out.println("--> Enter the File Name");
  			 String getname=sc.next();
  			 d.addfile(getname);
  			 break;
  			 
  		 case "b":
  			 System.out.println("--> Enter the File Name to Delete");
  			 String getnametodelete=sc.next();
  			 d.deletefilebyname(getnametodelete);
  			 break;
  			 
  		 case "c":
  			 System.out.println("--> Enter the file name to search:");
  			 String getnametosearch=sc.next();
  			 d.searchfilebyname(getnametosearch);
  			 break;
  		 default:
  			 break;
  		 }
  		
  		
  	 }
  	 break;
  	 default:
  		 break;
   
   }
  
		}
			}
			else
			{
				System.out.println("Please enter correct data");
			}
		}
		
		
		catch(InputMismatchException e)
		{
			System.out.println("please enter the correct choice");
			
		}
		 sc.close();
		
	
		
		
	}
}
