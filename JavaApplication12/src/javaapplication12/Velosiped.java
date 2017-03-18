
package javaapplication12;


public class Velosiped extends DorTransport{
    
    String vladeles;
    @Override
    public String getImage() {
        return "O-O/";
    }
    public Velosiped()  {
        this.kol_koles = 2;
    }
}
