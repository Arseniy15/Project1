
package javaapplication8;

public class HumanSmile extends Smile {
    private char leftEye;
    private char rightEye;
    public HumanSmile (char leftEye, char rightEye) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }
    @Override
    public String toString() {
        return "(" + leftEye + "_" + rightEye + ")";
    }
    protected char getleftEye() {return leftEye;}
    protected char getrightEye() {return rightEye;}
}
