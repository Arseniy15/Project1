
package javaapplication11;

public class GeometricCalc {
    
    public static int SumAll(int n, int a, int d) {
        if(n==0) return 0;
       return SumAll(n-1, a, d) + a + n*d;
    }
    
    
}
