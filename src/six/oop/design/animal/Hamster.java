package six.oop.design.animal;

import five.oo.Gender;

public class Hamster extends Animal{
    public Hamster(int uniqueNumber, String name, Gender gender) {
        super(uniqueNumber, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Hrk Hrk...");
    }
}
