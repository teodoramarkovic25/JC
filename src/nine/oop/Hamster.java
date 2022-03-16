package nine.oop;

public class Hamster extends Animal{

    private String name;
    public Hamster(String id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public void playSound() {
        System.out.println("Hrk hrk...." + name );

    }
}
