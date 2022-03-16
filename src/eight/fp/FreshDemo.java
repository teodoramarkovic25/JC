package eight.fp;

import seven.oop.Person;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FreshDemo {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPerson();
       procesirajElemente(personList,
                p -> true,
                p -> p.getSurname() + "" + p.getSurname() + "->" + p.getBirthday(),
            //  FreshDemo::printElement;
              System.out::println);

        List<String> personNames = socialNetwork.loadPersonNames();
       /* procesirajElemente(
                personNames,
                n -> n.startsWith("T"),
                it -> it,
                element -> System.out.println(element)
        );

        */
    }
    static <T> void printElement(T element){
        System.out.println(element);
    }

    // kako nad funkcijom uvesti generički tip podatka

    // E = Person               tipa String personNames
    //A - String              tipa string   it
    static <E, A> void procesirajElemente(List<E> elemeneti,
                                          Predicate<E> tester,
                                          Function<E, A> transformer,
                                          Consumer<A> consumer) {

        // IMPERATIVNI PRISTUP
        // testiraj element i odmah ga obradi ako prođe test
        /*  Iterator<E> elementIterator = elemeneti.iterator();
        while (elementIterator.hasNext()) {
            E element = elementIterator.next();
            if (tester.test(element)) {
                A anotherElement = transformer.apply(element);
                consumer.accept(anotherElement);
            }
        }

         */
        // FP style
        elemeneti.stream().filter(tester).map(transformer).forEach(consumer);
    }
}
