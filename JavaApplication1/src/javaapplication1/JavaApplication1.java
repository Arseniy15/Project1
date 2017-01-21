/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Ученик
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        String s= "Здравствуйте, заполните, пожалуйста, анкету \n";
        System.out.println(s);
        s= "1.Введите фамилию \n";
                System.out.println(s);
        String a= scanner.nextLine();
        s= "2.Введите имя \n";
        System.out.println(s);
        String b=scanner.nextLine();
        s= "3.Введите отчество \n";
        System.out.println(s);
        String c= scanner.nextLine();
        s= "4.Введите номер телефона \n";
        System.out.println(s);
        String d= scanner.nextLine();
        s= "5.Введите e-mail \n";
        System.out.println(s);
        String e= scanner.nextLine();
        s= "Приятно познакомиться, "+b+" "+c+" ваша анкета №12 \n";
        System.out.println(s);
        String f= scanner.nextLine();
    
}
}