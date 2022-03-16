package eight.fp;

import five.oo.Gender;
import seven.oop.Person;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonDemo {
    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPerson();
        /*Stream<Person> personStream = personList.stream();//1.IZVOR STRIMA
        Predicate<Person> personTester = p -> p.getAge() >= 30 && p.getAge() <= 40;
        personStream = personStream.filter(personTester); // 2.1.MEĐUOPERACIJA
        Function<Person, String> transformer = p -> p.getName();
        Stream<String> personNameStream = personStream.map(transformer);//2.2. MEĐUOPRECAIJA
        Consumer<String> nameConsumer = n -> System.out.println(n);
        personNameStream.forEach(nameConsumer);// TERMINIRAMO STREAM

        */

        //processTestablePersonList(personList, p -> true, p -> System.out.println(p));
//spliterator strimovi

        processTestableElementList(personList, p -> true, p -> p.getSurname(), p -> System.out.println(p));

    }

    //personList - E = Person
    //tester - E = person
    //transformer - E = Person u R = String
    // consumer - R = String
    static <E, R> void processTestableElementList(List<E> elementList,
                                                  Predicate<E> tester,
                                                  Function<E, R> transformer,
                                                  Consumer<R> consumer) {
        elementList.stream().filter(tester).map(transformer).forEach(consumer);
    }
}


        //static void processTestablePersonList(List<Person> personList, Predicate<Person> tester,Consumer<Person> consumer) {
        // 1.8. spliterator
       /* Iterator<Person> personIterator = elmentList.iterator();
        while (personIterator.hasNext()) {
            E person = personIterator.next();
            if (tester.test(person)) {
                R anotherElement = transformer.apply(person);
                consumer.accept(person);
            }
        }

        */


//Martin Fowler Fluentno programiranje
    /*    personList.stream()
                .filter(p -> p.getGender().equals(Gender.female))
                .map(p -> p.getName() + "" + p.getSurname())
                .forEach(ns -> System.out.println(ns));
                */


      /*  SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPerson();
        personList
                .stream()
                .filter(p -> p.getAge() >= 30 && p.getAge() <= 40)
                .forEach(person -> System.out.println(person));//p
        Person person = new Person()
                .setName("Petar")
                .setSurname("Pan")
                .setBirthday(LocalDate.of(1900, 1, 1));

    }
    */

        // printTestablePersonList(personList,p -> true );  // svaki element će proći test
        //printTestablePersonList(personList,p ->p.getGender().equals(Gender.male) );
        //printTestablePersonList(personList,p ->p.getAge()>=40 ); //<=40
        //  printTestablePersonList(personList,p ->p.getAge()>=30 && p.getAge()<=40 );
        //PersonTester personTester = (Person p) -> {return true;};
        //personTester.test();
        //printPersonList(personList);
        // printPersonListWithGender(personList,Gender.female);
        // printPersonListWithGender(personList,Gender.male);
        //printPersonsOlderThan(personList,40);
        //printPersonsYoungerThan(personList,40);ž
        //printPersonsBetweenAges(personList, 30,40);
       /*Stream<Person> personStream = personList.stream(); // izvor strima
      personStream= personStream.filter(p->p.getAge()>=30 && p.getAge()<=40); //međuoperacija
      personStream.forEach(p-> System.out.println(p)); // terminirajuća operacija
    }
*/




    /*static void printPersonList(List<Person> personList) {
        Iterator<Person> personIterator = personList.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println(person);
        }
    }
*/
      /*  static void printPersonListWithGender (List < Person > personList, Gender spol){
            Iterator<Person> personIterator = personList.iterator();
            while (personIterator.hasNext()) {
                Person person = personIterator.next();
                if (person.getGender().equals(spol))
                    System.out.println(person);
            }
        }

        static void printPersonsOlderThan (List < Person > personList,int age){
            Iterator<Person> personIterator = personList.iterator();
            while (personIterator.hasNext()) {
                Person person = personIterator.next();
                if (person.getAge() >= age) {
                    System.out.println(person);
                }

            }
        }

        static void printPersonsYoungerThan (List < Person > personList,int age){
            Iterator<Person> personIterator = personList.iterator();
            while (personIterator.hasNext()) {
                Person person = personIterator.next();
                if (person.getAge() <= age) {
                    System.out.println(person);
                }

            }
        }

        static void printPersonsBetweenAges (List < Person > personList,int minAge, int maxAge){
            Iterator<Person> personIterator = personList.iterator();
            while (personIterator.hasNext()) {
                Person person = personIterator.next();
                if (person.getAge() >= minAge && person.getAge() <= maxAge) {
                    System.out.println(person);
                }

            }
        }
    }
}


           /* if(person.getName().equals("Tea")) {
                personIterator.remove();

            }
        }

        Iterator <Person> personIterator1 = personList.iterator();
        while(personIterator1.hasNext()){
            Person person = personIterator1.next();
            System.out.println(person);
        }
*/
/*for(int i =0; i<personList.size(); i++){
    Person person = personList.get(i);
    System.out.println(person);
}
*/


