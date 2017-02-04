
package javaapplication8;


public class FishSmile extends AnimalSmile {
    private boolean napravlenie;
    public FishSmile(char leftEye, char rightEye, boolean napravlenie){
        super(leftEye, rightEye);
        this.napravlenie = napravlenie;
    }
    @Override
    public String toString () {
        char g = getleftEye();
        char h = getrightEye();
        if(napravlenie) {return "<" + g + ")" + ")" + ")" + "><";}
        else{return "><" + "(" + "(" + "(" + h + ">";}
    }
}
