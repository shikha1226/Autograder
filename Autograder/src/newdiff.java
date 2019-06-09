
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFileChooser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
//@RunWith(Suite.class)


public class newdiff
{
	
	
public static String diff(File file, File fil, String input) {
	
	 ArrayList<pairstring<pairstring<String, String>, Double>> plist = new ArrayList<pairstring<pairstring<String, String>, Double>>();
     
	 pairstring<String, String> npair; 
	        
	 pairstring<pairstring<String, String>, Double> wpair; 

	 Map<String, String> outdir = new HashMap<String, String>();//unique values of collection
	       
	        
	        ArrayList<String> list1 = new ArrayList<String>(); // New arraylist for file
	        
	        
	       
	        int i;
	       // String  input ;
	        int size = list1.size();
	        for (i = 0; i < size; i++)
	        {
	        	  String name;
	          File  files = new File( "testfiles/" + list1.get(i)); //read all files line by line 
	            name = files.getName();
	            input = "";

	            try
	            {
	                Scanner scanner = new Scanner(files);
	                while (scanner.hasNextLine())
	                {
	                    input += "\n" + scanner.nextLine(); //convert file to string
	                }
	            }  
	               
	           catch (FileNotFoundException e)
	            {
	                e.printStackTrace();
	            }
	            
	            ArrayList<String> list2 = new ArrayList<String>();
	            File file1 = new File("testfiles/givencode.java");
	            String lis="";
	            try {
	                Scanner scan1 = new Scanner(file1);
	                while (scan1.hasNextLine())
	                {
	                	lis=scan1.nextLine();
	                    
	                }
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	            }
	           
	            
	            String newstr = input.replace(lis, "");
	           input = newstr;
	     //  System.out.println(newstr);
	        // String   list22= list2.toString();
	         
	           //System.out.println(input);  
	                
	           // return newstr;        
	            
	        
			
	         
	       //System.out.println("Done");
	       
	      //System.out.println(input);
	        
	        }
			
	        return input; 
			
}
 
	 
 }



                