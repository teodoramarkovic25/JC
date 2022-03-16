package seven.oop;

import five.oo.Gender;

import java.time.LocalDate;

public class Executor {
    public static void main(String[] args) {
        int number = 22;
        number = 23;
        //NIZ
        String[] names = new String[4];
        names[0] = "Ena";
        names[1] = "Tea";
        names[2] = "Jeca";
        //KLASA ima polja koja ne moraju biti istog tipa
        LocalDate birthday = LocalDate.of(1999, 12, 23);
        Person person = new Person (142552, "Tea", "Marković", birthday, Gender.female);
        int age = person.getAge();
        System.out.println("Starost je " + age);
        Person person2 = new Person();
        person2.setName("Tea");
        Box<Integer> kutija = new Box<Integer>();
        kutija.setElement(23);
        Box<String> kutija2 = new Box<String>();
        kutija2.setElement("hdhdd");


    }
}
