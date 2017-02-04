
package javaapplication8;


public class CatSmile extends AnimalSmile {
  
    public CatSmile(char leftEye, char rightEye) {
        super(leftEye, rightEye);
    
}
    @Override
    public String toString() {
        char e = getleftEye();
        char f = getrightEye();
        return "=" + e + "." + f + "=";
    }
    
}
