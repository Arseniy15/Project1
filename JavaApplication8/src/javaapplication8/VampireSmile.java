
package javaapplication8;


public class VampireSmile extends Smile {
    private char leftEye;
    private char rightEye;
    public VampireSmile(char leftEye, char rightEye) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }
    @Override
    public String toString() {
        return "(" + leftEye + "," + "_" + ","+ rightEye + ")";
    }
}
