package six.oop.design.animal;

import five.oo.Gender;

public class Dog extends Animal{

    public Dog(int uniqueNumber, String name, Gender gender) {
        super(uniqueNumber, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Wow Wow...");

    }
}
