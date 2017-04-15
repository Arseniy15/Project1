
package javaapplication14;


public class JavaApplication14 {

   
    public static void main(String[] args) {
        
  Node<Integer> stack = new Node<Integer>();
  stack = Node.add(stack, 10);
  stack = Node.add(stack, 11);
  stack = Node.add(stack, 14);
  stack = Node.add(stack, 15);
  stack = Node.add(stack, 18);
            stack = Node.add(stack, 20);
            stack = Node.delete(stack);
      int value = Node.getTop(stack);
      System.out.println(value);
    }
    
}
