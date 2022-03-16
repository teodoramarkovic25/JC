package eight.fp;

import seven.oop.Person;

@FunctionalInterface
public interface ElementTester<E> {
    boolean test(E element);
}
