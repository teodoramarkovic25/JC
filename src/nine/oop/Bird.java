package nine.oop;

import six.oop.design.animal.Flyable;

// 1 klasa nasljeđuje samo 1 klasu
//
public class Bird extends Animal implements Flyable {
    public Bird(String id) {
        super(id);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu ćiu ćiu ");

    }

    @Override
    public void fly() {
        System.out.println("Ja sam ptica i letim");
    }
}
