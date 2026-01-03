import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Aruzhan", "Kenzhebulatova", 3.2));
        people.add(new Student("Dilnaz", "Zhamantayeva", 2.4));
        people.add(new Student("Darya", "Ulyanova", 3.8));
        people.add(new Student("Maria", "Shimunova", 2.1));

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                    p.toString() + " earns " +
                            String.format("%.2f", p.getPaymentAmount()) + " tenge"
            );
        }
    }
}