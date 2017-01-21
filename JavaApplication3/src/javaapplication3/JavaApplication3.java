/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ученик
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        String b; 
        Boolean c;
       HashMap<Integer,String>first=new HashMap<Integer,String> ();
       first.put(1, "Рыжик");
       first.put(2, "Рыжик");
       first.put(3, "Лео");
       first.put(4, "Барсик");
    
       
       
       
       
       HashMap<String,Boolean>second=new HashMap<String,Boolean> ();
       second.put("Рыжик", true);
       second.put("Рыжик", true);
       second.put("Лео", false);
       
       
          for(Map.Entry<Integer, String>entry:first.entrySet())
       {
           a=entry.getKey();
           b=entry.getValue();
         /*  second.containsKey() */
         c=second.get(b);
         if (second.containsKey(b)){
             
         
System.out.println(a);
System.out.println(b);
           System.out.println(c);
         }
           
       }
                   
                   
       }
           
    
           }


