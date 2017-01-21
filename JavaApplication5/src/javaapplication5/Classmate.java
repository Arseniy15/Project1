 
package javaapplication5;

import java.util.ArrayList;

public class Classmate {
    ArrayList<Human> students;
    public Classmate () {
        students = new ArrayList<Human> ();
    }
    
    public void addStudent(Human s) {
students.add(s);
}
    public Human findByName(String name)
    {
        for(Human s : students) {
            if(s.name.equals(name)) {
                return s;
            } 
            
         
        }
        return null;
    }
}
