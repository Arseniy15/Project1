
package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {
     Cow cow = new Cow();
      cow.name = "Кузя";
      cow.owner = "Вася";
      System.out.println(cow.name);
      Питомник краснаяЗвезда = new Питомник();
          краснаяЗвезда.тренироватьГолос(cow); 
    }
    
}
