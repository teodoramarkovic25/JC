package nine.collection;

import eight.fp.SocialNetwork;
import seven.oop.Container;
import seven.oop.Person;

import java.util.List;
import java.util.function.Consumer;

public class CollectionTester {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPerson();
// enhanced for loop napredna for petlja
    /*    for (Person p : personList) {
            p.printYourself();
        }

     */
        // 1.8 napredniji
        //1. izvor strima - kolekcija(objekat tipa svake kolekcije)
        //2. međuoperacije
        // 3. terminiranje

       /* PersonPrinter personPrinter = new PersonPrinter();
        personList
                .stream()
                //    .forEach(Person::printYourself);
                .forEach(personPrinter::printPerson);
    }

        */
        personList
                .stream()
                .forEach(CollectionTester::personConsumer);
    }

    static void personConsumer(Person person) {
        System.out.println(person.getSurname() + "" + person.getName());
    }
}

