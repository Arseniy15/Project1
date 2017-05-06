
package javaapplication15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class JavaApplication15 {
public static void f2(File f) {
               File[] subFiles = f.listFiles();
               if(subFiles==null) {
                   return;
               }
        
        int i;
        int n;
        n = subFiles.length;
      for(i=0; i<n; i++) {
         
          
          if(subFiles[i].isDirectory() ) {
               
              System.out.println(subFiles[i]);
               JavaApplication15.f2(subFiles[i]);
               
          }
           
          
          }
}
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\");
    
          
      
    File input = new File("input.txt");
    FileInputStream in = new FileInputStream(input);
    Scanner scan = new Scanner(in);
       int i = 0;
     while(scan.hasNextInt()) {
         i++;        
   
     }      
     File output = new File("output.txt");
    output.createNewFile();
    PrintStream out = new PrintStream(output);
    out.println(i);
        out.close();
    }
    }
    

