package six.oop.design.animal;

import five.oo.Gender;

public class Cat extends Animal{

    public Cat(int uniqueNumber, String name, Gender gender) {
        super(uniqueNumber, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Meow Meow");
    }
}

