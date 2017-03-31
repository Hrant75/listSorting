import java.util.*;

/**
 * Created by Hrant on 3/30/2017.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> personList  = setArrayList(new ArrayList<>());
        System.out.println("-----before sort-----");
        for(Person person : personList)
            System.out.println(person);

        Scanner scanner = new Scanner(System.in);
        System.out.print("please input sorting type (1-name, 2-last name, 3-age, 4-salary): ");
        String sortType = scanner.nextLine();
        int sortTypeInt = Integer.parseInt(sortType);
        switch (sortTypeInt) {
            case 1: Collections.sort(personList, new FirstNameComparator());
            break;
            case 2: personList.sort(Comparator.comparing(Person::getLastName));  //The Java 8 way of sorting using List.sort
            break;
            case 3: Collections.sort(personList, new AgeComparator());
            break;
            case 4: Collections.sort(personList, new SalaryComparator());
            break;
        }

        System.out.println("-----after sort-----");
        for(Person person : personList)
            System.out.println(person);
    }

    private static ArrayList<Person> setArrayList(ArrayList<Person> personList){
        personList.add(new Person("Masdasd", "Casdasd", 16));
        personList.add(new Person("Basdasd", "Xsdasd", 25));
        personList.add(new Employee("Nsdfsdf", "Psdfsdfsdf", 29, 199000));
        personList.add(new Person("Xasdsdas", "Asdgsdgsd", 18));
        personList.add(new Employee("Zzsdfdsfsdf", "Ftyrtyrty", 27, 320000));
        personList.add(new Person("Kasdsdas", "Gsdgsdgsd", 22));
        personList.add(new Employee("Dewrwer", "Aadfdfdfd", 27, 85000));
        personList.add(new Employee("Wfgdfgdf", "Ldfgfdgsdg", 19, 210000));
        return personList;
    }
}
