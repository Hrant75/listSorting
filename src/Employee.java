/**
 * Created by Hrant on 3/31/2017.
 */
public class Employee extends Person {
    private int salary;
    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return getName() + " " + getLastName() + " " + getAge() + " " + getSalary();
    }
}
