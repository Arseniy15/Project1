
package javaapplication9;


public class Calc {
       
        public static int factorial(int x) {
    if (x == 1 || x == 0) return 1;
    return x * factorial(x - 1);
}
    
       
        public static int sum(int a, int b) {
            int c = a+b;
            return c;
        }
      
       
}
