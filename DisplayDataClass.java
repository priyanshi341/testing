package lockedMe.com;

import java.io.File;
import java.io.IOException;

public class DisplayDataClass {
   File f;
   
  //Adding File 
   public void addfile(String data)
   {
	   f=new File("C:\\Assignment_1\\"+data);
	   if(f.exists())
	   {
		   System.out.println("--> File already exists");
	   }
	   else
	   {
		   try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		   System.out.println("--> File created by name of: "+data);
	   }
   }
   
  
   //Deleting file by give file name
   public void deletefilebyname(String data)
   {
	   f=new File("C:\\Assignment_1\\"+data);
	   if(f.exists())
	   {
		   f.delete();
		   System.out.println("--> Successfully Deleted File By Name: "+data);
	   }
	   else
	   {
		   System.out.println("--> No File Exist By Name: "+data);
	   }
   }
   
   //searching file by give file name
   
   public void searchfilebyname(String data)
   {
	   f=new File("C:\\Assignment_1\\"+data);
	   if(f.exists())
	   {
		   System.out.println("--> File Exits By Name: "+data);
		   System.out.println("--> Path Of File "+data+" is-> "+f.getAbsolutePath());
	   }
	   else
	   {
		   System.out.println("--> No file Exist By Name: "+data);
	   }
   }
   
   //Displaying all files in particular folder
   
   public void displayallfile()
   {
	   f=new File("C:\\Assignment_1\\");
	   String data[]=f.list();
	   if(data.length==0)
	   {
		   System.out.println("--> No File Entered Yet to Path: "+f.getAbsolutePath());
	   }
	   else
	   {
		   for(int i=0;i<data.length-1;i++)
		   {
			   for(int j=0;j<data.length-1-i;j++)
			   {
				   if(data[j].compareTo(data[j+1])>0)
				   {
					   String temp=data[j];
					   data[j]=data[j+1];
					   data[j+1]=temp;
				   }
			   }
		   }
		   
		   //display
		   for(int i=0;i<data.length;i++)
		   {
			   System.out.println(data[i]);
		   }
			   
	   }
   }


   
}
