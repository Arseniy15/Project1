
package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {
      Cat cat = new Cat();
      cat.name = "Барсик";
      cat.owner = "Петя";
      System.out.println(cat.name);
      Питомник краснаяЗвезда = new Питомник();
          краснаяЗвезда.тренироватьГолос(cat); 
    }
    
}
