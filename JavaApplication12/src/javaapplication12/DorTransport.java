
package javaapplication12;


public abstract class DorTransport {
    
    int kol_koles;
    @Override 
    public String toString() {
    return "Я дорожный транспорт, и у меня есть колёса";
}
  public abstract String getImage();
}