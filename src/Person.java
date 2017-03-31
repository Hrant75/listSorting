/**
 * Created by Hrant on 3/30/2017.
 */
public class Person {
    private String name;
    private String lastName;
    private int age;

    Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString(){
        return getName() + " " + getLastName() + " " + getAge();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
