package seven.oop;

import com.sun.source.tree.Tree;
import five.oo.Gender;

import java.time.LocalDate;
import java.util.*;

public class PersonFactory {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person tea = new Person(123, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female);
        personList.add(tea);
        personList.add(tea);
        personList.add(new Person(1238, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female));
        personList.add(new Person(123, "Tea", "Marković", LocalDate.of(1899, 5, 17), Gender.female));
        personList.add(new Person(12, "Dado", "Marković", LocalDate.of(2000, 9, 1), Gender.male));
        personList.add(new Person(121, "Jeca", "Marković", LocalDate.of(1099, 11, 4), Gender.female));
        personList.add(new Person(1211, "Nina", "Marković", LocalDate.of(1809, 4, 22), Gender.female));
        personList.add(new Person(1212, "Mina", "Marković", LocalDate.of(1899, 12, 21), Gender.unknown));
        personList.add(new Person(1213, "Ena", "Marković", LocalDate.of(2007, 6, 7), Gender.female));
        personList.add(new Person(1214, "Dora", "Marković", LocalDate.of(2012, 4, 19), Gender.female));

        for (Person person : personList) {
            System.out.println(person.toString());
        }
        System.out.println();
        System.out.println("Idu setovi...");
        Set<Person> personSet = new LinkedHashSet<>();
        Person tea2 = new Person(1234, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female);
        personList.add(tea2);
        personList.add(tea2);
        personSet.add(new Person(1234, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female));
        personSet.add(new Person(1234, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female));
        personSet.add(new Person(12, "Dado", "Marković", LocalDate.of(2000, 9, 1), Gender.male));
        personSet.add(new Person(121, "Jeca", "Marković", LocalDate.of(1099, 11, 4), Gender.female));
        personSet.add(new Person(1211, "Nina", "Marković", LocalDate.of(1809, 4, 22), Gender.female));
        personSet.add(new Person(1212, "Mina", "Marković", LocalDate.of(1899, 12, 21), Gender.unknown));
        personSet.add(new Person(1213, "Ena", "Marković", LocalDate.of(2007, 6, 7), Gender.female));
        personSet.add(new Person(1214, "Dora", "Marković", LocalDate.of(2012, 4, 19), Gender.female));
        for (Person person : personSet) {
            System.out.println(person);

        }

    }
}
