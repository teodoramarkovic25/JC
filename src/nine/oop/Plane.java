package nine.oop;

import six.oop.design.animal.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Ja sam avion i letim ");
    }
}
