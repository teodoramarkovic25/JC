package six.oop.design;
/*
DRY - Do not Repeat Yourself
SINGLE SOURCE OF TRUTH
Open/Close  Open for extension close for modification
*/

import five.oo.Gender;
import six.oop.design.animal.*;
import six.oop.design.human.Penzioner;
import six.oop.design.human.Person;
import six.oop.design.human.Profesor;
import six.oop.design.human.Student;

public class Tester {

    public static void main(String[] args) {
        Person person = new Student();
        Cat cat = new Cat(123, "Tom", Gender.male);
        person.setAnimal(cat);

        Bird bird = new Bird(122, "Cvrkica", Gender.female);
        bird.fly();






     /*   Profesor profesor = new Profesor();
        profesor.setName("Teodora");
        profesor.setSurname("Marković");
        profesor.setAge(17);
        Cat cat = new Cat(1212, "Cicko", Gender.male);
        cat.playSound();
        profesor.setAnimal(cat);
        Dog dog = new Dog(1221, "Luna", Gender.female);
        dog.playSound();
        profesor.setAnimal(dog);
        Hamster hamster = new Hamster(345, "Miki", Gender.unknown);
        profesor.setAnimal(hamster);
        Student student = new Student();
        student.setName("Jelena");
        student.setSurname("Msrković");
        student.setGender(Gender.female);
        student.setAnimal(hamster);
        Fish fish = new Fish(1234, "Goldi", Gender.female);
        student.setAnimal(fish);
        Penzioner penzioner = new Penzioner();
        penzioner.setAnimal(dog);
        */


    }
}
