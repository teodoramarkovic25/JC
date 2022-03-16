package eight;

import five.oo.Gender;
import seven.oop.Box;
import seven.oop.Person;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        //TIP ime_varijebla = PODATAK;
        char slovo = 'A';
        //TIP ime_variable = PODACI;
        //SIROVI SLOŽENI TIP PODATKA
        Person person = new Person(1234,"Ena", "Zukanović", LocalDate.of(1999, 1,1), Gender.female);
        //TIP ime_variable = PODACI;
        //PARAMETRIZIRANI SLOŽENI TIP PODATKA
        Box<String> kutija = new Box<>();
        kutija.setElement("Text");
    }
}
