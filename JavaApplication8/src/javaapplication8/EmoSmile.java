
package javaapplication8;

public class EmoSmile extends HumanSmile {
   
    private boolean visibleEye;
    public EmoSmile(char leftEye, char rightEye, boolean visibleEye) {
        super(leftEye, rightEye);
        this.visibleEye = visibleEye;
    }
    @Override
    public String toString() {
        
        char a= getleftEye() ;
     
        char b = getrightEye();
        if(visibleEye) {return "(" + a + "_\\\\\\";} 
                else {return "///_" + b + ")";}
        }
}
