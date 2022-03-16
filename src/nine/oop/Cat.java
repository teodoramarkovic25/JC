package nine.oop;

public class Cat extends Animal{

    private String name;
    public Cat(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void playSound() {
        System.out.println("Meow meow meow " + name);

    }
}
