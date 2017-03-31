import java.util.Comparator;

/**
 * Created by Hrant on 3/31/2017.
 */
public class SalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int o1Salary = 0;
        int o2Salary = 0;
        if(o1 instanceof Employee) o1Salary = ((Employee) o1).getSalary();
        if(o2 instanceof Employee) o2Salary = ((Employee) o2).getSalary();

        return o2Salary - o1Salary;
    }
}
