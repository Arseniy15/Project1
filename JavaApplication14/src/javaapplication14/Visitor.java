
package javaapplication14;


public class Visitor  implements AbstractVisitor <Integer> {
    @Override
    public void visit(Node<Integer> n) {
        System.out.println(n.value);
        
    }
}
