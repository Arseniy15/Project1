
package javaapplication14;

public class Node<T> {
    
    T value;
    Node<T> next;
    public static <R> Node<R> add(Node<R> stack, R value){
        Node<R> n = new Node<R>();
        n.next = stack;
        n.value = value;
        stack = n;
        return stack;
    }
    public static Node delete(Node stack) {
        stack = stack.next;
        return stack;
              
    }
   public static int getTop(Node stack) {
       
    
    
    return stack.value;  
   }
 }
