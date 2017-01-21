/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ученик
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Integer>number = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer>number2 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer>resultnumber = new HashMap<Integer,Integer>();
        
    number.put(0,2);
    number.put(1,4);
    number.put(2,2);
    number2.put(0,2);
    number2.put(1,5);
    number2.put(2,7);
    resultnumber.put(0,4);
    resultnumber.put(1,9);
    resultnumber.put(2,9);
            
        System.out.println(resultnumber);
    }
}


