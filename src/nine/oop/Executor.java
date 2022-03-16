package nine.oop;

import six.oop.design.animal.Flyable;

public class Executor {
    public static void main(String[] args) {
        Executor executor = new Executor();
        // Animal, Dog
        Dog dog = new Dog("121323323", "Lesi");
        executor.playWithAnimal(dog);
        // Animal, Cat
        Cat cat = new Cat("125363", "Tom");
        executor.playWithAnimal(cat);
        // Animal, Hamster
        Hamster hamster = new Hamster("2277", "Jerry");
        executor.playWithAnimal(hamster);
        Bird bird = new Bird("12444");


        executor.playWithAnimal(bird);
        executor.tryToFLy(bird);
        Plane plane = new Plane();
        executor.tryToFLy(plane);
        Flyable flyable = () -> System.out.println("ja letim iako ne znam kakav sam leteći objekat");
        executor.tryToFLy(flyable);
    }


    private void playWithAnimal(Animal animal) {
        animal.playSound();
    }


    private void tryToFLy(Flyable flyable) {
        flyable.fly();

    }

   /* private void playWithDog(Dog dog) {
        dog.playSound();
    }

    private void playWithCat(Cat cat) {
        cat.playSound();
    }



    private void playWithHamster(Hamster hamster) {
        hamster.playSound();
    }

    */
}
