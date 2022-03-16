package eight.fp;

import five.oo.Gender;
import seven.oop.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SocialNetwork {
    public List<Person> loadPerson() {
        List<seven.oop.Person> personList = new ArrayList<>();
        seven.oop.Person tea = new seven.oop.Person(123, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female);
        personList.add(tea);
        personList.add(tea);
        personList.add(new seven.oop.Person(1238, "Tea", "Marković", LocalDate.of(2004, 1, 12), Gender.female));
        personList.add(new seven.oop.Person(123, "Tea", "Marković", LocalDate.of(1899, 5, 17), Gender.female));
        personList.add(new seven.oop.Person(12, "Dado", "Panić", LocalDate.of(2000, 9, 1), Gender.male));
        personList.add(new seven.oop.Person(121, "Jeca", "Talić", LocalDate.of(1099, 11, 4), Gender.female));
        personList.add(new seven.oop.Person(1211, "Nina", "Radić", LocalDate.of(1809, 4, 22), Gender.female));
        personList.add(new seven.oop.Person(1212, "Mina", "Đoković", LocalDate.of(1899, 12, 21), Gender.unknown));
        personList.add(new seven.oop.Person(1213, "Semra", "Namić", LocalDate.of(2007, 6, 7), Gender.female));
        personList.add(new seven.oop.Person(1214, "Teodora", "Čajić", LocalDate.of(2012, 4, 19), Gender.female));

        return personList;
    }
    public List<String> loadPersonNames(){
        return loadPerson().stream().map(Person :: getName).collect(Collectors.toList());
    }
}
