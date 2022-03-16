package nine.oop;

// 1.polja ili atributi ili property
//2. konstruktor
//3. metode ili funkcije
// 4. apstraktne metode
public abstract class Animal {
    private String id;

    public Animal(String id) {
        this.id = id;
    }
    public abstract void playSound();

    // 1. a1 objekat
    // 2.  String a1Id = a1.getId();
    public String getId() {
        return id;
    }

    // a1 objekat
    //  String a1Id = a1.setId("4435667");
    public void setId(String id) {
        this.id = id;
    }

}
