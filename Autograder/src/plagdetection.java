
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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


public class plagdetection
{
	
	public static double sam;


	public static void main(String[] args) throws IOException
	{
        
     //Arraylist of pair which will exceed threshold for similarity

ArrayList<pairstring<pairstring<String, String>, Double>> plist = new ArrayList<pairstring<pairstring<String, String>, Double>>();
        
 pairstring<String, String> npair; 
        
 pairstring<pairstring<String, String>, Double> wpair; 

 Map<String, String> outdir = new HashMap<String, String>();//unique values of collection
       
        
        ArrayList<String> list1 = new ArrayList<String>(); // New arraylist for file
        
        
        JFileChooser jfile = new JFileChooser(); //Files selection
        jfile.setMultiSelectionEnabled(true);
        Component frame=null;
        jfile.showOpenDialog(frame);
        File[] file = jfile.getSelectedFiles();
         
         for (int i = 0; i < file.length; i++) {
             if (file[i].isFile()) {
                 list1.add(file[i].getName()); //Add files in arraylist
             } 
         }
        
        int i;
        String  input = null;
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
            /*
            ArrayList<String> list2 = new ArrayList<String>();
            File file1 = new File("testfiles/sell.java");
            try {
                Scanner scan1 = new Scanner(file1);
                while (scan1.hasNextLine())
                {
                	list2.add(scan1.nextLine());
                    
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
         String   list22= list2.toString();
            //subtract all comments, and keywords
        */  
            input= newdiff.diff(files, files, input);
            
            input = input.replaceAll("/\\*\\*(?s:(?!\\*/).)*\\*/","").replaceAll("/\\*.*?\\*/","").replaceAll("//.*", "");
            
            String [] kywrd = {"public", "void", "private", "boolean", "true","false", "null",  "int", "double", "else",
                    "break", "byte", "case", "catch", "char", "class", "const","continue", "default", "do", "extends", "for", "finally",
                    "float", "goto", "if", "import", "instanceof","interface", "long", "native", "new", "package", "protected",
                    };

            List<String> wlist = Arrays.asList(kywrd);
            Collection<String> wtable = new HashSet<String>(wlist);
           
            String [] inarry;
            inarry = input.split("[ ]");
                 
           int k=0;
            while (k < inarry.length) 
            {
                if (wtable.contains(inarry[k]))
                {
                    input = input.replaceAll(inarry[k], "");
                }
                k++;
            }

            input = input.replaceAll("\\s", ""); 
            outdir.put(name, input);	//insert all string
            
         // outdir.remove(list22); 
          //.out.println(outdir);
        }
    	
                

     //   String new_string = name.replace(to_remove, "");

//        
        size = outdir.size();
        for (i = 0; i < size; i++) 
        {
		
            if (i == size - 1)
            {
                break;
            }
            String output; 
          String  name = list1.get(i);
            output = outdir.get(name);
		int j;
		String name1;
            for (j = i + 1; j < size; j++) //compare every files
            {
            String	output1;
            
            
                name1 = list1.get(j);
                output1 = outdir.get(name1);
                
               // File file2=new File("sell2.java");
                //String nam = file2.toString();
                
               // String new_string = output1.replace(nam, "");  
               //System.out.println(new_string);
                
               // calculate Levenshtein distance and percentage 
                
                int dist = pairstring.comldistance(output, output1);
               // double same = Math.abs((1.0 - (double)dist /  Math.max(output.length(), output1.length()))) * 100;
				
             
                double same = pairstring.similarity(dist, output, output1);
                System.out.println("plagiarism : " + name + " and " + name1 + ": " + pairstring.form(same, 2) + "%");
                //output files which have more then 40% similarity
              String sam = "plagiarism : " + name + " and " + name1 + ": " + pairstring.form(same, 2) + "%";
               
              File file2 = new File("result.txt");
              FileWriter fw = new FileWriter(file2,true);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(sam);
              bw.newLine();
              bw.close();
              
                if (same>40)
                {
                    npair = new pairstring<String, String>(name,name1);
                    wpair = new pairstring<pairstring<String, String>, Double>(npair,same);
                    plist.add(wpair);
                    
                }
           
        }
            
                    }
		
        System.out.println("Plagiarised Files: "); 	//print all pairs
        size = plist.size();
        i=0;
        while (i<size)
        {
            wpair = plist.get(i);
            System.out.println(wpair.getFirst() + ": " + pairstring.form(wpair.getSecond(), 2) + "%");
            i++;
        
        }
   
        System.out.println("Done");
        
        
        
       
        }
	
	
}
