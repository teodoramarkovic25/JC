package nine.oop;
// Animal animal = new Animal();
// Dog dog = new Dog();


//animal.playSound();
//dog.playSound();

public class Dog extends Animal {
    private String name;
    public Dog(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void playSound() {
        System.out.println("Wow wow..." + name);

    }
}
