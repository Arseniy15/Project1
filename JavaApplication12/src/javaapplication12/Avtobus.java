
package javaapplication12;


public  class Avtobus extends ObAvTransport {
    
   
    public Avtobus() {
        super(); 
        this.kol_mest = 30;
        this.moshnost = 100;
    }
    @Override 
    public String getImage() {
        return "o[]o";
    }    
}
