package module1.Person;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("Askar","Ilyas",23);
        Student student=new Student("James","Claire",22,"00001",
                "Information Security");
        Professor professor=new Professor("Alan","Lem",48,"00012",
                "Cybersec");
        List<Person> people=new ArrayList<>(){{
            add(person);
            add(student);
            add(professor);
        }};
        for (Person p:people){
            System.out.println(p);
        }
    }}
