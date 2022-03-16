package six.oop.design.animal;

import five.oo.Gender;

public class Fish extends Animal{
    public Fish(int uniqueNumber, String name, Gender gender) {
        super(uniqueNumber, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Blb Blb...");

    }
}
