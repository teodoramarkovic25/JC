package six.oop.design.animal;

import five.oo.Gender;

public class Bird extends Animal implements Flyable{
    public Bird(int uniqueNumber, String name, Gender gender) {
        super(uniqueNumber, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu");
    }

    @Override
    public void fly() {
        System.out.println("Ptica leti");
    }
}
