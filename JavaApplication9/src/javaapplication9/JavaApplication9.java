
package javaapplication9;


public class JavaApplication9 {

    public static void main(String[] args) {
   
   int res= Calc.factorial(6); 
    
   
   int res2 = Calc.sum(res, 23);
   
   int res3= Calc.factorial(8);
    int res4 = Calc.sum(res2, res3);
    int res5 = Calc.sum(res4, 8);
    System.out.println(res5);
    
    
}
}
