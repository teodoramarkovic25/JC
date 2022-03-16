package nine.collection;

import seven.oop.Person;
// instancna - objekat PersonPrinter pPrinter;
public class PersonPrinter {
    public void printPerson(Person p){
        System.out.println(p.getId()+ ":"+ p.getName() +  " ," + p.getSurname() + "," + p.getBirthday() +", "+ p.getBirthday()+""+ p.getAge()+ "spol" + p.getGender() );
    }
}
