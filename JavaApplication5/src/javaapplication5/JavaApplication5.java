
package javaapplication5;


public class JavaApplication5 {

   
    public static void main(String[] args) {
        Human petya = new Human("Петя", 15, "10.12.2001", "программирование");
        Human kolya = new Human("Коля", 14, "13.08.2002", "рисование");
        Human vitya = new Human("Витя", 13, "12.07.2003", "спорт");
        Classmate classmate = new Classmate();
         classmate.addStudent(petya);
        
         classmate.addStudent(kolya); 
            
        
           classmate.addStudent(vitya); 
            Human s = classmate.findByName("Петя");
         Human a =   classmate.findByName("Коля");
           Human b = classmate.findByName("Витя");
           String c = getInfoAbout(s); 
    }
    
    public static String getInfoAbout(Human human) {
String humanInfo = "Имя: " + human.name + " "  +"Возраст: "+ human.age + " " +"Дата рождения: "+ human.datarozhdeniya + " "  +"Хобби: "+ human.hobbi;

return humanInfo;


}
}
