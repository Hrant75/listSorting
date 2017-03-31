import java.util.Comparator;

/**
 * Created by Hrant on 3/30/2017.
 */
public class FirstNameComparator  implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
