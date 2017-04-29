
package javaapplication14;

public class Visitor2 implements AbstractVisitor <Integer>{
    
    @Override
    public void visit(Node <Integer> n) {
        int b;
       
        b = n.value*2;
        n.value = b;
      
    }
}
