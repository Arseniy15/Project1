
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
    public static <R> Node <R> delete(Node<R> stack) {
        stack = stack.next;
        return stack;
              
    }
   public static <R> R getTop(Node <R> stack) {
       
    
    
    return stack.value;  
   }
   
   
              


      public static <D> Node <D> r(Node <D> stack, AbstractVisitor <D> c) {
          Node <D> n;
          n = stack;
          while(n!=null) {
        c.visit(n);
        n = n.next;
          }
          return n;
      }

      
 }
