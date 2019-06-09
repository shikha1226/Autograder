import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFileChooser;

import com.sun.xml.internal.ws.util.StringUtils;

public class def {
	
	public static String[]star(ArrayList<String> ar) //Convert array to string
    { 
  
        Object[] obar = ar.toArray(); 
        
        String[] st = Arrays.copyOf(obar, obar.length,String[].class); 
  
        return st; 
    } 
	
    public static void main(String[] args) {
    	
    	String output, output2;
    	
    	
    	 ArrayList<pairstring<pairstring<String, String>, Double>> plist = new ArrayList<pairstring<pairstring<String, String>, Double>>();
    	 pairstring<String, String> npair; 
    	 pairstring<pairstring<String, String>, Double> wpair; 
 		
    	ArrayList<String> list1 = new ArrayList<String>();
    	File file = new File("testfiles/Fibo1.java");
    	try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine())
            {
            	list1.add(scan.nextLine());
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    	
        ArrayList<String> list2 = new ArrayList<String>();
            File file1 = new File("testfiles/givencode.java");
            try {
                Scanner scan = new Scanner(file1);
                while (scan.hasNextLine())
                {
                	list2.add(scan.nextLine());
                    
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

      
           list1.removeAll(list2);
           list1.remove("/s");
  
           System.out.println("Difference between two files = " + list1);

        }   
    }
    
