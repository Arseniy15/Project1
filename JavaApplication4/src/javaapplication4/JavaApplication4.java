
package javaapplication4; 


public class JavaApplication4 {


public static void main(String[] args) {
    Human human = new Human("Арсений", 15, "10.12.2001", "программирование");
   Human a = human;
   Human b = human;
   Human c = human;
   human.age = 20;
   
human.age();
human.name();
human.datarozhdeniya();
String humanInfo = getInfoAbout(human);
String aInfo = getInfoAbout(a);
System.out.println(aInfo);
String bInfo = getInfoAbout(b);
String cInfo = getInfoAbout(c);
System.out.println(humanInfo);



System.out.println(bInfo);

System.out.println(cInfo);
}
public static String getInfoAbout(Human human) {
String humanInfo = "Имя: " + human.name + " "  +"Возраст: "+ human.age + " " +"Дата рождения: "+ human.datarozhdeniya + " "  +"Хобби: "+ human.hobbi;

return humanInfo;


}

}

