
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

   
    public static void main(String[] args) {
        
  Node<Integer> stack= null;
  Visitor v = new Visitor(); 
  Visitor2 c = new Visitor2();

            
            
    
   
      
      
    
     Scanner scanner = new Scanner(System.in);
     while(true) {
     System.out.println("Выберите функцию");
     System.out.println("1.Добавление элементов стэка ");
     System.out.println("2.Вывод элементов на экран");
     System.out.println("3.Умножение на два");
     int up = scanner.nextInt();
    if(up== 1 ) {
        
     int h = scanner.nextInt();
     stack = Node.add(stack, h);
    }
    if (up==2 ) {
        Node.r(stack, v);
     
    }
    if(up== 3) {
        Node.r(stack, c);
       Node.r(stack, v);
    }
        
    }
    }
    
}
